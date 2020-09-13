package kimchi.bridge.firebase.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import kimchi.logger.LogLevel
import kimchi.logger.LogWriter

/**
 * Send Log messages to Crashlytics's logs.
 *
 * This will not log exceptions, only the log messages.
 * You can use this directly to control how logs are written. For example,
 * combining this with `.withThreshold(LogLevel.INFO)` would prevent
 * logs more detailed than info level from being logged.
 * If you want to log all logs as well as exceptions, use [crashlyticsLogger]
 *
 * @param crashlytics Optional parameter for manually specifying the crashlytics instance to use.
 */
class FirebaseCrashlyticsLogMessageAdapter(
    private val crashlytics: FirebaseCrashlytics = Firebase.crashlytics
): LogWriter {
    override fun log(level: LogLevel, message: String, cause: Throwable?) {
        crashlytics.log("[${level.name}]: $message")
    }
    override fun shouldLog(level: LogLevel, cause: Throwable?): Boolean = true
}

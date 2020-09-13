package kimchi.bridge.firebase.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import kimchi.logger.LogLevel
import kimchi.logger.LogWriter

/**
 * Send Logged exceptions to Crashlytics's non-fatal reports.
 *
 * This will only log exceptions, not log messages.
 * You can use this directly to control how non-fatals are written. For example,
 * combining this with `.withThreshold(LogLevel.INFO)` would prevent
 * non-fatals more detailed than info level from being logged.
 * If you want to log all logs as well as exceptions, use [crashlyticsLogger]
 *
 * @param crashlytics Optional parameter for manually specifying the crashlytics instance to use.
 */
class FirebaseCrashlyticsExceptionAdapter(
    private val crashlytics: FirebaseCrashlytics = Firebase.crashlytics
): LogWriter {
    override fun log(level: LogLevel, message: String, cause: Throwable?) {
        crashlytics.recordException(cause ?: return)
    }

    override fun shouldLog(level: LogLevel, cause: Throwable?): Boolean = cause != null
}

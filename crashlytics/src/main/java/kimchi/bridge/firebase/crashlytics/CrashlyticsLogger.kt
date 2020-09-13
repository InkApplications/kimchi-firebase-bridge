package kimchi.bridge.firebase.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import kimchi.logger.CompositeLogWriter
import kimchi.logger.LogWriter

/**
 * Creates Crashlytics logging for both non-fatals and log messages.
 *
 * This will log all log messages to Crashlytics and record any non-fatals
 * logged as exceptions.
 *
 * If you would like to control the logs or non-fatals independently,
 * use the [FirebaseCrashlyticsLogMessageAdapter] and
 * [FirebaseCrashlyticsExceptionAdapter] classes directly, as these
 * classes can be combined with existing functionality like `withThreshold`.
 *
 * @param crashlytics Optional parameter for manually specifying the crashlytics instance to use.
 */
fun crashlyticsLogger(
    crashlytics: FirebaseCrashlytics = Firebase.crashlytics
): LogWriter = CompositeLogWriter(setOf(
    FirebaseCrashlyticsLogMessageAdapter(crashlytics),
    FirebaseCrashlyticsExceptionAdapter(crashlytics)
))


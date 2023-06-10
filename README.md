# Firebase Bridge for Kimchi

This provides a default implementation for integrating Firebase
into [Kimchi]'s logging and analytics.

## Installation

 - Make sure [Kimchi] is already installed
 - Make sure [Firebase is set up](https://firebase.google.com/docs/android/setup)
 - Add the maven artifact `com.inkapplications.kimchi-firebase-bridge:analytics:2.+`
 - If using Crashlytics, make sure the [plugin is properly installed](https://firebase.google.com/docs/crashlytics/get-started?authuser=0&platform=android)

## Usage

### Firebase Analytics

Just add the adapter to your list of Kimchi Analytics Writers:

```kotlin
Kimchi.addAnalytics(FirebaseAnalyticsAdapter())
```

### Crashlytics

To send all logs and non-fatals to crashlytics, add the adapter to your list
of Kimchi Log Writers:

```kotlin
Kimchi.addLog(crashlyticsLogger())
```

That's it! Your logs for non-fatals should now appear in Crashlytics.


## Firebase Supported versions

See the [Change Log] for information about firebase SDK updates.

[Change Log]: CHANGELOG.md
[Kimchi]: https://kimchi.inkapplications.com

# Firebase Bridge for Kimchi

This provides a default implementation for integrating Firebase Analytics
into [Kimchi]'s Analytics logging.

## Installation

 - Make sure [Kimchi] is already installed
 - Make sure [Firebase is set up](https://firebase.google.com/docs/android/setup)
 - Add the maven artifact `com.github.inkapplications.kimchi-firebase-bridge:analytics:1.0.0` 

## Usage

Just add the adapter to your list of Kimchi Analytics Writers:

```kotlin
Kimchi.addAnalytics(FirebaseAnalyticsAdapter())
```

That's it! Your logs through Kimchi should now be sent to Firebase.

## Firebase Supported versions

See the [Change Log] for information about firebase SDK updates.

[Change Log]: CHANGELOG.md
[Kimchi]: https://kimchi.inkapplications.com

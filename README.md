Note App

This is a simple Note App for Android built with clean architecture principles using Jetpack libraries such as Compose, Hilt, and Room.


- Introduction

The Note App is designed to provide a simple and intuitive way to create, edit, and delete notes on your Android device. It follows clean architecture principles to ensure maintainability, testability, and scalability, and leverages Kotlin Flow for reactive programming.

- Architecture Overview

The architecture is based on the principles of Clean Architecture with the following layers:

- Presentation Layer (Compose):
  - UI components using Jetpack Compose.
  - ViewModels for managing UI-related data using Kotlin Flow for reactive updates.

- Domain Layer:
  - Use Cases: Business logic and use case definitions.
  - Entities: Business objects representing core data structures.

- Data Layer (Repository Pattern):
  - Repositories: Abstract data sources.
  - Data Sources: Implementations of repositories using local and remote data sources.
  - Room Database: Local storage for note data using Kotlin Flow for asynchronous updates.

- Dependency Injection:
  - Hilt for dependency injection throughout the app.

## Libraries Used

- Jetpack Compose
- Hilt (Dagger)
- Room Database
- Kotlin Coroutines
- Kotlin Flow
- ViewModel
- LiveData
- Navigation Component

## Project Structure

app
src
main
java/com/nirali/noteapp
di // Hilt dependency injection modules
domain // Use cases and entities
data // Repositories and data sources
presentation // Compose UI components and ViewModels using Kotlin Flow
res



## Features

- Create, read, update, and delete notes.
- Swipe-to-delete functionality.
- Dark mode support.
- Reactive UI updates using Kotlin Flow.

## Screenshots

<img width="424" alt="Screenshot 2024-01-19 at 2 11 06 PM" src="https://github.com/Nirali123456789/CleanArchitecture-NoteApp/assets/90322848/4898639c-e0a2-4533-98b3-9155c8a539ef">
<img width="424" alt="Screenshot 2024-01-19 at 2 10 58 PM" src="https://github.com/Nirali123456789/CleanArchitecture-NoteApp/assets/90322848/63fcaf96-7903-4ab0-a6a7-f12ee2bf8f93">
<img width="424" alt="Screenshot 2024-01-19 at 2 10 50 PM" src="https://github.com/Nirali123456789/CleanArchitecture-NoteApp/assets/90322848/935c546d-f48a-427d-b391-f5af2114c1cf">
<img width="424" alt="Screenshot 2024-01-19 at 2 10 40 PM" src="https://github.com/Nirali123456789/CleanArchitecture-NoteApp/assets/90322848/94d5bdf3-dc1d-47ef-8629-da47c9ffd929">


## How to Build

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Contributing

Feel free to contribute to this project by submitting issues, feature requests, or pull requests. Your feedback is highly appreciated!

## License

This project is licensed under the [MIT License](LICENSE).

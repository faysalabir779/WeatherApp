# Weather App

This is a simple weather application that fetches real-time weather data using the [OpenWeatherMap API](https://openweathermap.org/api) and displays it to the user. The app is built using Retrofit for API calls, providing a clean and efficient way to handle network requests.

## Features

- Real-time weather updates
- Search weather by city name
- Display temperature, humidity, wind speed, and weather conditions
- Responsive and user-friendly interface

## Technologies Used
- XML
- Kotlin
- Lottie Files
- Android Studio



## API Reference

This application uses the OpenWeatherMap API to fetch weather data. You can find more details and register for an API key at the [OpenWeatherMap API Documentation](https://openweathermap.org/api).

### Example API Request

```http
GET https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
```

### Parameters
- "q": City name
- "appid": Your API key from OpenWeatherMap

## Documentation

### Setup
- Clone the repository:
```http
git clone https://github.com/yourusername/weather-app.git
```
- Navigate to the project directory:
```http
cd weather-app
```
-Add your OpenWeatherMap API key to the local.properties file:
```http
WEATHER_API_KEY=your_api_key_here
```
- Build and run the project using your preferred IDE.

## Dependencies
- Retrofit: For making API calls
```htttp
implementation ("com.squareup.retrofit2:retrofit:2.9.0")
```
- Gson: For parsing JSON responses
```http
implementation ("com.squareup.retrofit2:converter-gson:2.2.0")
```
- Lottie: To show animated weather condition
```http
implementation 'com.airbnb.android:lottie:$lottieVersion'
```


## Project Flow
- User Input: The user enters a city name in the search bar.
- API Request: Retrofit sends a request to the OpenWeatherMap API - with the city name and API key.
- Data Processing: The API response is parsed using Gson.
- UI Update: The parsed data is displayed on the screen, showing the current weather conditions for the specified city.

## Download APK
You can download the APK from the links below:
[Download User App APK](https://github.com/faysalabir779/WeatherApp/releases/download/1.1/Weather.App.apk)

## Usage
- Open the app.
- Enter the city name in the search bar.
- Click the search button to fetch and display the weather data.

## FAQ
Q: How do I get an API key for OpenWeatherMap?
A: Sign up at OpenWeatherMap to get a free API key.

Q: Why am I getting a 401 Unauthorized error?
A: Make sure your API key is correct and has not expired. You can generate a new key if needed.

Q: Can I use this app to get weather data for multiple cities?
A: Yes, you can search for different cities by entering the city name in the search bar.


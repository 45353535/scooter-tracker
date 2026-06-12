## Состояние: РАБОТАЕТ

Последняя рабочая сборка: https://github.com/45353535/scooter-tracker/actions/runs/27439804286

### Что сделано
- Android-приложение для отслеживания расстояния на скутере (выше порога скорости)
- GPS через `LocationManager` + `GPS_PROVIDER` (без Play Services, работает офлайн)
- Отображение количества спутников и статуса GPS-фиксации
- Compose UI: спидометр, карточка дистанции/статуса, слайдер порога скорости, кнопка Старт/Стоп
- Темная тема

### Архитектура
- `TrackingService` — foreground service с LocationManager
- `MainActivity` — bind к сервису через `MutableStateFlow` + `collectAsState()`
- Состояния (speed, distance, isTracking, satelliteCount, hasGpsFix) — через `StateFlow`
- Порог скорости передаётся в `ACTION_START` при нажатии кнопки

### Ключевые файлы
- `app/src/main/java/com/scootertracker/MainActivity.kt` — UI + binding
- `app/src/main/java/com/scootertracker/TrackingService.kt` — локация + логика
- `.github/workflows/build.yml` — CI, собирает APK
- `app/src/main/AndroidManifest.xml` — пермишены

### Известные проблемы
- На Android 13+ нужна `POST_NOTIFICATIONS` — запрашивается при старте, но если пользователь отклонит — `startForeground()` упадёт (ловится в catch, но трекинг не запустится)
- После `stopSelf()` сервиса binding разрывается, переподключения нет (кроме пересоздания Activity)

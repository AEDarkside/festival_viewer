# festival_viewer for EnergyAustralia Coding Test
This is simple program in respond to EnergyAustralia coding test, which request data from swagger API and then parse into a string of formated entries.

# Environment
- Java 8

# Running the Jar file
clone the project. navigate to 'dist' folder and use command ```java -jar MusicBandViewer.jar```

# Known issue
    1. swagger API sometime return response code 429 and cause the program exit in error
    2. response data from swagger API sometime is missing few chunk of data which may cause program exit in error

- Solution - re-run the jar file few times.


# Author
ZhiChao Chen
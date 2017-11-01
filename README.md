# Logger

Simple and ready-to-use Logger for Java-SE Projects based on log4j2

# Using  ...

 - Logger.log.info();
 - Logger.log.warn();
 - Logger.log.error();
 - Logger.log.debug();
 - Logger.log.trace();
 
 ## Maven
 ```
 <project>
	...
	<repositories>
	...
	<repository>
		<releases>
			 <enabled>true</enabled>
			<updatePolicy>always</updatePolicy>
			<checksumPolicy>fail</checksumPolicy>
		</releases>
		<id>fo0</id>
		<name>fo0systems.net</name>
		<url>http://fo0.me/maven2</url>
		<layout>default</layout>
	</repository>
	...
	</repositories>
	
	...
	<dependencies>
	...
	<dependency>
		<groupId>com.fo0.logger</groupId>
		<artifactId>Logger</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>
	...
	</dependencies>
	...

	</project>
  ```
 ## Config-File
 The Logger creates automatically a config file .properties on Path: "config/logger.properties".
 
 Example:
```
#This is a sample for java properties
#Thu Mar 02 15:11:28 CET 2017
LOGGER_ENABLE_COLOR=true
LOGGER.LEVEL=DEBUG
```

Options are:
- LOGGER_ENABLE_COLOR=true|false
- LOGGER=INFO|WARN|ERROR|DEBUG|TRACE

## Environment Detection
It has a detection for current environment. 
Compatibility table comming soon...
 
# Eclipse Plugins:
## Colorized Console Output

    https://marketplace.eclipse.org/content/ansi-escape-console



# Techshop

#### How to configure project to use RESTeasy

- Open web.xml and write the code below

```xml
	<servlet-mapping>
		<servlet-name>javax.ws.rs.core.Application</servlet-name>
		<url-pattern>/*</url-pattern>
	</servlet-mapping>
```


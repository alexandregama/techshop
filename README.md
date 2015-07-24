# Techshop

#### How to configure project to use RESTeasy

- This project uses WildFly as AS
- WildFly uses RESTeasy as RI of JAX-RS
- Open web.xml and write the code below

```xml
	<servlet-mapping>
		<servlet-name>javax.ws.rs.core.Application</servlet-name>
		<url-pattern>/*</url-pattern>
	</servlet-mapping>
```


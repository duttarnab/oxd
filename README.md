# oxd

oxd is a middleware service web application developers can use to facilitate user authentication and authorization with an external OAuth 2.0 identity provider. Learn more in the [oxd documentation](https://oxd.gluu.org/docs).

oxd is [commercial software](./LICENSE) -- Copyright Gluu Inc.

## Docker edition

Example of build and run commands with obligatory parameters
```
docker build -t <image_tag> .
```
``` 
docker run -p 8443:8443 
-v /volume_with_kestore:/vol:ro 
--env LICENSE_ID=<YOUR_LICENSE_ID>
--env PUBLIC_KEY=<YOUR_PUBLIC_KEY> 
--env PUBLIC_PASSWORD=<YOUR_PUBLIC_PASSWORD> 
--env LICENSE_PASSWORD=<YOUR_LICENSEE_PASSWORD> 
--env SERVER_NAME=my_oxd 
--env KEYSTORE_PATH=/vol/oxd-server.keystore 
--env KEYSTORE_PASSWORD=example 
--name oxd-server 
--dns 8.8.8.8 
<image_tag> 
```

List of optional parameters:

| Variable | Default value |
|----------|---------------|
|SUPPORT_GOOGLE_LOGOUT|true|
|USE_CLIENT_AUTHENTICATION_FOR_PAT | true|
|TRUST_ALL_CERTS | true|
|KEYSTORE_VALIDATE_CERT | false|
|TRUST_STORE_PATH | ''|
|TRUST_STORE_PASSWORD | ''|
| CRYPT_PROVIDER_KEY_STORE_PATH | ''|
|CRYPT_PROVIDER_KEY_STORE_PASSWORD | ''|
|CRYPT_PROVIDER_DN_NAME | ''|
|TRUST_STORE_PATH | ''|
|STATE_EXPIRATION_IN_MINUTES | 5|
|NONCE_EXPIRATION_IN_MINUTES | 5|
|PUBLIC_OP_KEY_CACHE_EXPIRATION_IN_MINUTES| 60|
|NONCE_EXPIRATION_IN_MINUTES | 5|
|PROTECT_COMMANDS_WITH_ACCESS_TOKEN | false|
|UMA2_AUTO_REGISTER_CLAIMS_GATHERING_ENDPOINT_AS_REDIRECT_URI_OF_CLIENT | true|
|MIGRATION_SOURCE_FOLDER_PATH | ''|
|REMOVE_EXPIRED_CLIENTS | false|
|APPLICATION_CONNECTOR_HTTP_PORT | 8084|
|APPLICATION_CONNECTOR_HTTPS_PORT | 8443|
|ADMIN_CONNECTOR_HTTPS_PORT | 8444|
|ROOT_LOG_LEVEL | INFO|
|GLUU_LOG_LEVEL | INFO|
|XDI_LOG_LEVEL | INFO|
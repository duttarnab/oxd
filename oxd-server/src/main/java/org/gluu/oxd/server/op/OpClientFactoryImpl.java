package org.gluu.oxd.server.op;

import org.gluu.oxauth.client.*;
import org.gluu.oxauth.client.uma.UmaClientFactory;
import org.gluu.oxauth.model.crypto.signature.RSAPublicKey;
import org.gluu.oxauth.model.crypto.signature.SignatureAlgorithm;
import org.gluu.oxauth.model.jws.RSASigner;
import org.gluu.oxauth.model.jwt.Jwt;
import org.gluu.oxd.rs.protect.resteasy.PatProvider;
import org.gluu.oxd.rs.protect.resteasy.ResourceRegistrar;
import org.gluu.oxd.rs.protect.resteasy.RptPreProcessInterceptor;
import org.gluu.oxd.rs.protect.resteasy.ServiceProvider;
import org.gluu.oxd.server.introspection.ClientFactory;
import org.gluu.oxd.server.service.PublicOpKeyService;
import org.jboss.resteasy.client.ClientExecutor;
import org.jboss.resteasy.client.ClientRequest;

public class OpClientFactoryImpl implements OpClientFactory {

    public OpClientFactoryImpl() {
    }

    public TokenClient createTokenClient(String url) {
        return new TokenClient(url);
    }

    public TokenClient createTokenClientWithUmaProtectionScope(String url) {
        return new TokenClient(url);
    }

    public UserInfoClient createUserInfoClient(String url) {
        return new UserInfoClient(url);
    }

    public RegisterClient createRegisterClient(String url) {
        return new RegisterClient(url);
    }

    public OpenIdConfigurationClient createOpenIdConfigurationClient(String url) throws Exception{
        return new OpenIdConfigurationClient(url);
    }

    public AuthorizeClient createAuthorizeClient(String url) {
        return new AuthorizeClient(url);
    }

    public ResourceRegistrar createResourceRegistrar(PatProvider patProvider, ServiceProvider serviceProvider) {
        return new ResourceRegistrar(patProvider, serviceProvider);
    }

    public ClientFactory createClientFactory() {
        return ClientFactory.instance();
    }

    public UmaClientFactory createUmaClientFactory() {
        return UmaClientFactory.instance();
    }

    public JwkClient createJwkClient(String url) {
        return new JwkClient(url);
    }

    public RSASigner createRSASigner(SignatureAlgorithm signatureAlgorithm, RSAPublicKey rsaPublicKey) {
        return new RSASigner(signatureAlgorithm, rsaPublicKey);
    }

    public RptPreProcessInterceptor createRptPreProcessInterceptor(ResourceRegistrar resourceRegistrar) {
        return new RptPreProcessInterceptor(resourceRegistrar);
    }

    public ClientRequest createClientRequest(String uriTemplate, ClientExecutor executor) throws Exception {
        return new ClientRequest(uriTemplate, executor);
    }

}

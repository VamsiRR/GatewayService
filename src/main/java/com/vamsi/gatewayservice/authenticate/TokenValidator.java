package com.vamsi.gatewayservice.authenticate;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class TokenValidator
{
    public static final String SECRET = "196f05070da54e029aed7318875d15c9dhatgskdedjhsytydhheekkshciowahffsbmluqlalaqyyuckamhhebnsqppafemaizgeh";


    public void validateToken(final String token) {
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }



    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}

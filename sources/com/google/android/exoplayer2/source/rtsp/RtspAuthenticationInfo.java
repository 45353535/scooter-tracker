package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.android.exoplayer2.util.Util;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
final class RtspAuthenticationInfo {
    private static final String ALGORITHM = "MD5";
    public static final int BASIC = 1;
    public static final int DIGEST = 2;
    private static final String DIGEST_FORMAT = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    private static final String DIGEST_FORMAT_WITH_OPAQUE = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    public final int authenticationMechanism;
    public final String nonce;
    public final String opaque;
    public final String realm;

    public RtspAuthenticationInfo(int i10, String str, String str2, String str3) {
        this.authenticationMechanism = i10;
        this.realm = str;
        this.nonce = str2;
        this.opaque = str3;
    }

    private String getBasicAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo) {
        String str = rtspAuthUserInfo.username;
        String str2 = rtspAuthUserInfo.password;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str2);
        return Base64.encodeToString(RtspMessageUtil.getStringBytes(sb2.toString()), 0);
    }

    private String getDigestAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i10) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String methodString = RtspMessageUtil.toMethodString(i10);
            String str = rtspAuthUserInfo.username;
            String str2 = this.realm;
            String str3 = rtspAuthUserInfo.password;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str2);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str3);
            String hexString = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb2.toString())));
            String strValueOf = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(methodString).length() + 1 + strValueOf.length());
            sb3.append(methodString);
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append(strValueOf);
            String hexString2 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb3.toString())));
            String str4 = this.nonce;
            StringBuilder sb4 = new StringBuilder(String.valueOf(hexString).length() + 2 + String.valueOf(str4).length() + String.valueOf(hexString2).length());
            sb4.append(hexString);
            sb4.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb4.append(str4);
            sb4.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb4.append(hexString2);
            String hexString3 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb4.toString())));
            return this.opaque.isEmpty() ? Util.formatInvariant(DIGEST_FORMAT, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString3) : Util.formatInvariant(DIGEST_FORMAT_WITH_OPAQUE, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString3, this.opaque);
        } catch (NoSuchAlgorithmException e10) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e10);
        }
    }

    public String getAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i10) throws ParserException {
        int i11 = this.authenticationMechanism;
        if (i11 == 1) {
            return getBasicAuthorizationHeaderValue(rtspAuthUserInfo);
        }
        if (i11 == 2) {
            return getDigestAuthorizationHeaderValue(rtspAuthUserInfo, uri, i10);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }
}

package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import com.ironsource.D5;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final DataSource.Factory dataSourceFactory;

    @Nullable
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(@Nullable String str, DataSource.Factory factory) {
        this(str, false, factory);
    }

    private static byte[] executePost(DataSource.Factory factory, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        StatsDataSource statsDataSource = new StatsDataSource(factory.createDataSource());
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i10 = 0;
        DataSpec dataSpecBuild2 = dataSpecBuild;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecBuild2);
                try {
                    return Util.toByteArray(dataSourceInputStream);
                } catch (HttpDataSource.InvalidResponseCodeException e10) {
                    try {
                        String redirectUrl = getRedirectUrl(e10, i10);
                        if (redirectUrl == null) {
                            throw e10;
                        }
                        i10++;
                        dataSpecBuild2 = dataSpecBuild2.buildUpon().setUri(redirectUrl).build();
                        Util.closeQuietly(dataSourceInputStream);
                    } finally {
                        Util.closeQuietly(dataSourceInputStream);
                    }
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(dataSpecBuild, (Uri) Assertions.checkNotNull(statsDataSource.getLastOpenedUri()), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e11);
            }
        }
    }

    @Nullable
    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = invalidResponseCodeException.responseCode;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(builder.setUri(uri).build(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.PLAYREADY_UUID;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C.CLEARKEY_UUID.equals(uuid) ? D5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            map.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, licenseServerUrl, keyRequest.getData(), map);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws MediaDrmCallbackException {
        return executePost(this.dataSourceFactory, provisionRequest.getDefaultUrl() + "&signedRequest=" + Util.fromUtf8Bytes(provisionRequest.getData()), null, Collections.EMPTY_MAP);
    }

    public void setKeyRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public HttpMediaDrmCallback(@Nullable String str, boolean z10, DataSource.Factory factory) {
        Assertions.checkArgument((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z10;
        this.keyRequestProperties = new HashMap();
    }
}

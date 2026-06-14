package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5092fd implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f77160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f77161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f77162c;

    public C5092fd(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f77160a = remoteConfigExtensionConfiguration;
        this.f77161b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f77162c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    public final byte[] a(@NotNull Object obj) {
        return (byte[]) this.f77162c.fromModel(obj);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.f77161b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f77162c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f77161b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f77161b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f77162c.toModel((byte[]) obj);
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.f77161b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] bArr) {
        return this.f77162c.toModel(bArr);
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f77160a;
    }
}

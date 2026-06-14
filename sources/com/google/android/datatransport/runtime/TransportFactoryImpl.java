package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f24362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TransportContext f24363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TransportInternal f24364c;

    TransportFactoryImpl(Set set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f24362a = set;
        this.f24363b = transportContext;
        this.f24364c = transportInternal;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
        return getTransport(str, cls, Encoding.of("proto"), transformer);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.f24362a.contains(encoding)) {
            return new TransportImpl(this.f24363b, str, encoding, transformer, this.f24364c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.f24362a));
    }
}

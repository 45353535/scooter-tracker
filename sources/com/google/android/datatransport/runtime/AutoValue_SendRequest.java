package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_SendRequest extends SendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TransportContext f24325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Event f24327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Transformer f24328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Encoding f24329e;

    static final class Builder extends SendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TransportContext f24330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f24331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Event f24332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Transformer f24333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Encoding f24334e;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder a(Encoding encoding) {
            if (encoding == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f24334e = encoding;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder b(Event event) {
            if (event == null) {
                throw new NullPointerException("Null event");
            }
            this.f24332c = event;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String str = "";
            if (this.f24330a == null) {
                str = " transportContext";
            }
            if (this.f24331b == null) {
                str = str + " transportName";
            }
            if (this.f24332c == null) {
                str = str + " event";
            }
            if (this.f24333d == null) {
                str = str + " transformer";
            }
            if (this.f24334e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.f24330a, this.f24331b, this.f24332c, this.f24333d, this.f24334e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder c(Transformer transformer) {
            if (transformer == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f24333d = transformer;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f24330a = transportContext;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f24331b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    Event a() {
        return this.f24327c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    Transformer b() {
        return this.f24328d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendRequest) {
            SendRequest sendRequest = (SendRequest) obj;
            if (this.f24325a.equals(sendRequest.getTransportContext()) && this.f24326b.equals(sendRequest.getTransportName()) && this.f24327c.equals(sendRequest.a()) && this.f24328d.equals(sendRequest.b()) && this.f24329e.equals(sendRequest.getEncoding())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
        return this.f24329e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
        return this.f24325a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
        return this.f24326b;
    }

    public int hashCode() {
        return ((((((((this.f24325a.hashCode() ^ 1000003) * 1000003) ^ this.f24326b.hashCode()) * 1000003) ^ this.f24327c.hashCode()) * 1000003) ^ this.f24328d.hashCode()) * 1000003) ^ this.f24329e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f24325a + ", transportName=" + this.f24326b + ", event=" + this.f24327c + ", transformer=" + this.f24328d + ", encoding=" + this.f24329e + "}";
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding) {
        this.f24325a = transportContext;
        this.f24326b = str;
        this.f24327c = event;
        this.f24328d = transformer;
        this.f24329e = encoding;
    }
}

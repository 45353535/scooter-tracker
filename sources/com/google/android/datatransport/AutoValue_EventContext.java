package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.android.datatransport.EventContext;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_EventContext extends EventContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f24116c;

    static final class Builder extends EventContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f24118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f24119c;

        Builder() {
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new AutoValue_EventContext(this.f24117a, this.f24118b, this.f24119c);
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.f24118b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f24119c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String str) {
            this.f24117a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventContext) {
            EventContext eventContext = (EventContext) obj;
            String str = this.f24114a;
            if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
                boolean z10 = eventContext instanceof AutoValue_EventContext;
                if (Arrays.equals(this.f24115b, z10 ? ((AutoValue_EventContext) eventContext).f24115b : eventContext.getExperimentIdsClear())) {
                    if (Arrays.equals(this.f24116c, z10 ? ((AutoValue_EventContext) eventContext).f24116c : eventContext.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsClear() {
        return this.f24115b;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsEncrypted() {
        return this.f24116c;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public String getPseudonymousId() {
        return this.f24114a;
    }

    public int hashCode() {
        String str = this.f24114a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24115b)) * 1000003) ^ Arrays.hashCode(this.f24116c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f24114a + ", experimentIdsClear=" + Arrays.toString(this.f24115b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f24116c) + "}";
    }

    private AutoValue_EventContext(String str, byte[] bArr, byte[] bArr2) {
        this.f24114a = str;
        this.f24115b = bArr;
        this.f24116c = bArr2;
    }
}

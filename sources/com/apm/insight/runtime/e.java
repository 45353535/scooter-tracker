package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f8085b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f8087a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.f8087a == null) {
                this.f8087a = Header.b(com.apm.insight.e.g());
            }
            return this.f8087a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f8086a;

    e() {
        this(f8085b);
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.f8086a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.f8086a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f8086a = eVar;
    }
}

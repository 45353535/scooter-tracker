package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes9.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f28623b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap a(y yVar) {
        this.f28623b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap b(String str) {
        this.f28622a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final aq c() {
        y yVar;
        String str = this.f28622a;
        if (str != null && (yVar = this.f28623b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f28622a == null) {
            sb2.append(" token");
        }
        if (this.f28623b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

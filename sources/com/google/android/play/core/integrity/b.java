package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes9.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f28676b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.f28676b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f28675a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f28675a;
        if (str != null && (yVar = this.f28676b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f28675a == null) {
            sb2.append(" token");
        }
        if (this.f28676b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

package com.my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f60837d;

    public t5(String str) {
        this.f60834a = str;
    }

    public Object a() {
        return this.f60837d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t5 t5Var = (t5) obj;
            if (this.f60835b == t5Var.f60835b && this.f60836c == t5Var.f60836c && this.f60834a.equals(t5Var.f60834a) && Objects.equals(this.f60837d, t5Var.f60837d)) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f60836c;
    }

    @NonNull
    public String getUrl() {
        return this.f60834a;
    }

    public int getWidth() {
        return this.f60835b;
    }

    public int hashCode() {
        return Objects.hash(this.f60834a);
    }

    public void setHeight(int i10) {
        this.f60836c = i10;
    }

    public void setWidth(int i10) {
        this.f60835b = i10;
    }

    public void a(Object obj) {
        this.f60837d = obj;
    }
}

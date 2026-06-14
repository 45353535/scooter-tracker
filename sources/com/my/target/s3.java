package com.my.target;

import com.my.target.h6;
import com.my.target.l;

/* JADX INFO: loaded from: classes11.dex */
public class s3 extends l {

    public static class a implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60785a;

        public a(int i10) {
            this.f60785a = i10;
        }

        @Override // com.my.target.l.a
        public v a() {
            return v3.a(this.f60785a);
        }

        @Override // com.my.target.l.a
        public s b() {
            return null;
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return false;
        }

        @Override // com.my.target.l.a
        public q d() {
            return t3.a(this.f60785a);
        }
    }

    public interface b extends l.b {
    }

    public s3(j jVar, int i10, h6.a aVar) {
        super(new a(i10), jVar, aVar);
    }

    public static l a(j jVar, h6.a aVar, int i10) {
        return new s3(jVar, i10, aVar);
    }
}

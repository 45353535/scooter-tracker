package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes9.dex */
public final class AtProtobuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Protobuf.IntEncoding f32775b = Protobuf.IntEncoding.DEFAULT;

    private static final class ProtobufImpl implements Protobuf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f32776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Protobuf.IntEncoding f32777c;

        ProtobufImpl(int i10, Protobuf.IntEncoding intEncoding) {
            this.f32776b = i10;
            this.f32777c = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f32776b == protobuf.tag() && this.f32777c.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f32776b) + (this.f32777c.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.f32777c;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.f32776b;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f32776b + "intEncoding=" + this.f32777c + ')';
        }
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public Protobuf build() {
        return new ProtobufImpl(this.f32774a, this.f32775b);
    }

    public AtProtobuf intEncoding(Protobuf.IntEncoding intEncoding) {
        this.f32775b = intEncoding;
        return this;
    }

    public AtProtobuf tag(int i10) {
        this.f32774a = i10;
        return this;
    }
}

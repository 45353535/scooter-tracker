package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32797a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32798b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FieldDescriptor f32799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ProtobufDataEncoderContext f32800d;

    ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f32800d = protobufDataEncoderContext;
    }

    private void a() {
        if (this.f32797a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f32797a = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@Nullable String str) throws IOException {
        a();
        this.f32800d.d(this.f32799c, str, this.f32798b);
        return this;
    }

    void b(FieldDescriptor fieldDescriptor, boolean z10) {
        this.f32797a = false;
        this.f32799c = fieldDescriptor;
        this.f32798b = z10;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(float f10) throws IOException {
        a();
        this.f32800d.c(this.f32799c, f10, this.f32798b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(double d10) throws IOException {
        a();
        this.f32800d.b(this.f32799c, d10, this.f32798b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(int i10) throws IOException {
        a();
        this.f32800d.e(this.f32799c, i10, this.f32798b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(long j10) throws IOException {
        a();
        this.f32800d.f(this.f32799c, j10, this.f32798b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(boolean z10) throws IOException {
        a();
        this.f32800d.g(this.f32799c, z10, this.f32798b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        a();
        this.f32800d.d(this.f32799c, bArr, this.f32798b);
        return this;
    }
}

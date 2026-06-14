package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HashFunction[] f30714b;

    AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.f30714b = hashFunctionArr;
    }

    private Hasher a(final Hasher[] hasherArr) {
        return new Hasher(this) { // from class: com.google.common.hash.AbstractCompositeHashFunction.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractCompositeHashFunction f30716b;

            {
                this.f30716b = this;
            }

            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                return this.f30716b.b(hasherArr);
            }

            @Override // com.google.common.hash.Hasher
            public <T> Hasher putObject(@ParametricNullness T t10, Funnel<? super T> funnel) {
                for (Hasher hasher : hasherArr) {
                    hasher.putObject(t10, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBoolean(boolean z10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBoolean(z10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putByte(byte b10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putByte(b10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putChar(char c10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putChar(c10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putDouble(double d10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putDouble(d10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putFloat(float f10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putFloat(f10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putInt(int i10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putInt(i10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putLong(long j10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putLong(j10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putShort(short s10) {
                for (Hasher hasher : hasherArr) {
                    hasher.putShort(s10);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr, int i10, int i11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr, i10, i11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(ByteBuffer byteBuffer) {
                int iPosition = byteBuffer.position();
                for (Hasher hasher : hasherArr) {
                    Java8Compatibility.d(byteBuffer, iPosition);
                    hasher.putBytes(byteBuffer);
                }
                return this;
            }
        };
    }

    abstract HashCode b(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.f30714b.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i10 = 0; i10 < length; i10++) {
            hasherArr[i10] = this.f30714b[i10].newHasher();
        }
        return a(hasherArr);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        int length = this.f30714b.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i11 = 0; i11 < length; i11++) {
            hasherArr[i11] = this.f30714b[i11].newHasher(i10);
        }
        return a(hasherArr);
    }
}

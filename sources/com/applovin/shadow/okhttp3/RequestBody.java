package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Source;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lcom/applovin/shadow/okhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lcom/applovin/shadow/okio/BufferedSink;", y.f66058y, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okhttp3/RequestBody$Companion;", "", "()V", "create", "Lcom/applovin/shadow/okhttp3/RequestBody;", "contentType", "Lcom/applovin/shadow/okhttp3/MediaType;", C4240b4.i.f42616b, "Ljava/io/File;", "content", "", "offset", "", "byteCount", "", "Lcom/applovin/shadow/okio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, i10, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.create(bArr, mediaType, i10, i11);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, i10, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.create(mediaType, bArr, i10, i11);
        }

        @NotNull
        public final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @NotNull
        public final RequestBody create(@NotNull final ByteString byteString, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                @Nullable
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final byte[] bArr, @Nullable final MediaType mediaType, final int i10, final int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                @Nullable
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(bArr, i10, i11);
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final File file, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                @Nullable
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    Source source = Okio.source(file);
                    try {
                        sink.writeAll(source);
                        c.a(source, null);
                    } finally {
                    }
                }
            };
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull byte[] content, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, offset, byteCount);
        }

        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return create(file, contentType);
        }
    }

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull BufferedSink sink) throws IOException;

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        return INSTANCE.create(mediaType, file);
    }

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i10) {
        return INSTANCE.create(mediaType, bArr, i10);
    }

    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i10, int i11) {
        return INSTANCE.create(mediaType, bArr, i10, i11);
    }

    @NotNull
    public static final RequestBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i10) {
        return INSTANCE.create(bArr, mediaType, i10);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i10, int i11) {
        return INSTANCE.create(bArr, mediaType, i10, i11);
    }
}

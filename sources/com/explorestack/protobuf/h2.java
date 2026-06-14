package com.explorestack.protobuf;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
abstract class h2 {

    static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteString f19119a;

        a(ByteString byteString) {
            this.f19119a = byteString;
        }

        @Override // com.explorestack.protobuf.h2.c
        public byte byteAt(int i10) {
            return this.f19119a.byteAt(i10);
        }

        @Override // com.explorestack.protobuf.h2.c
        public int size() {
            return this.f19119a.size();
        }
    }

    static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f19120a;

        b(byte[] bArr) {
            this.f19120a = bArr;
        }

        @Override // com.explorestack.protobuf.h2.c
        public byte byteAt(int i10) {
            return this.f19120a[i10];
        }

        @Override // com.explorestack.protobuf.h2.c
        public int size() {
            return this.f19120a.length;
        }
    }

    private interface c {
        byte byteAt(int i10);

        int size();
    }

    static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bByteAt = cVar.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(ByteString.copyFromUtf8(str));
    }
}

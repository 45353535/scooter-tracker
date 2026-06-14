package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class TextFormatEscaper {

    private interface ByteSequence {
        byte byteAt(int i10);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb2 = new StringBuilder(byteSequence.size());
        for (int i10 = 0; i10 < byteSequence.size(); i10++) {
            byte bByteAt = byteSequence.byteAt(i10);
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

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.1
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i10) {
                return byteString.byteAt(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return byteString.size();
            }
        });
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.2
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i10) {
                return bArr[i10];
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }
}

package com.fyber.inneractive.sdk.protobuf;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h3 {
    public static String a(s sVar) {
        StringBuilder sb2 = new StringBuilder(sVar.size());
        for (int i10 = 0; i10 < sVar.size(); i10++) {
            byte bC = sVar.c(i10);
            if (bC == 34) {
                sb2.append("\\\"");
            } else if (bC == 39) {
                sb2.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
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
                        if (bC < 32 || bC > 126) {
                            sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb2.append((char) (((bC >>> 6) & 3) + 48));
                            sb2.append((char) (((bC >>> 3) & 7) + 48));
                            sb2.append((char) ((bC & 7) + 48));
                        } else {
                            sb2.append((char) bC);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}

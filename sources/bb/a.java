package bb;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends xa.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f6138c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f6139a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f6140b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f6139a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f6140b.decode(byteBuffer).toString();
                this.f6140b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f6140b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f6140b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f6139a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // xa.c
    protected v b(xa.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new v(new c(bArr, null, null));
        }
        Matcher matcher = f6138c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new v(new c(bArr, str, str2));
    }
}

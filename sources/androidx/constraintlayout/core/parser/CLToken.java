package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = "true".toCharArray();
        this.mTokenFalse = "false".toCharArray();
        this.mTokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isNull() throws CLParsingException {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i10);
        sb2.append(content());
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (!CLParser.sDebug) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c10, long j10) {
        int iOrdinal = this.mType.ordinal();
        if (iOrdinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i10 = this.mIndex;
            if (cArr[i10] == c10) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i10] == c10) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i10] == c10) {
                this.mType = Type.NULL;
            }
            z = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i11 = this.mIndex;
            z = cArr2[i11] == c10;
            if (z && i11 + 1 == cArr2.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i12 = this.mIndex;
            z = cArr3[i12] == c10;
            if (z && i12 + 1 == cArr3.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i13 = this.mIndex;
            z = cArr4[i13] == c10;
            if (z && i13 + 1 == cArr4.length) {
                setEnd(j10);
            }
        }
        this.mIndex++;
        return z;
    }
}

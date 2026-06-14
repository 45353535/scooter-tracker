package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.AtomicFile;
import com.mbridge.msdk.playercommon.exoplayer2.util.ReusableBufferedOutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
class CachedContentIndex {
    public static final String FILE_NAME = "cached_content_index.exi";
    private static final int FLAG_ENCRYPTED_INDEX = 1;
    private static final int VERSION = 2;
    private final AtomicFile atomicFile;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private boolean changed;
    private final Cipher cipher;
    private final boolean encrypt;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SecretKeySpec secretKeySpec;

    public CachedContentIndex(File file) {
        this(file, null);
    }

    private void add(CachedContent cachedContent) {
        this.keyToContent.put(cachedContent.key, cachedContent);
        this.idToKey.put(cachedContent.f50071id, cachedContent.key);
    }

    private CachedContent addNew(String str) {
        CachedContent cachedContent = new CachedContent(getNewId(this.idToKey), str);
        add(cachedContent);
        this.changed = true;
        return cachedContent;
    }

    private static Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static int getNewId(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    private boolean readFile() throws Throwable {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(this.atomicFile.openRead());
            dataInputStream = new DataInputStream(bufferedInputStream);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int i10 = dataInputStream.readInt();
            if (i10 >= 0 && i10 <= 2) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.cipher == null) {
                        Util.closeQuietly(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.cipher.init(2, this.secretKeySpec, new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.cipher));
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    }
                } else if (this.encrypt) {
                    this.changed = true;
                }
                int i11 = dataInputStream.readInt();
                int iHeaderHashCode = 0;
                for (int i12 = 0; i12 < i11; i12++) {
                    CachedContent fromStream = CachedContent.readFromStream(i10, dataInputStream);
                    add(fromStream);
                    iHeaderHashCode += fromStream.headerHashCode(i10);
                }
                int i13 = dataInputStream.readInt();
                boolean z10 = dataInputStream.read() == -1;
                if (i13 == iHeaderHashCode && z10) {
                    Util.closeQuietly(dataInputStream);
                    return true;
                }
                Util.closeQuietly(dataInputStream);
                return false;
            }
            Util.closeQuietly(dataInputStream);
            return false;
        } catch (IOException unused2) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                Util.closeQuietly(dataInputStream2);
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                Util.closeQuietly(dataInputStream2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void writeFile() throws Throwable {
        DataOutputStream dataOutputStream;
        Throwable th2;
        IOException e10;
        DataOutputStream dataOutputStream2 = null;
        DataOutputStream dataOutputStream3 = null;
        try {
            OutputStream outputStreamStartWrite = this.atomicFile.startWrite();
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new ReusableBufferedOutputStream(outputStreamStartWrite);
            } else {
                reusableBufferedOutputStream.reset(outputStreamStartWrite);
            }
            dataOutputStream = new DataOutputStream(this.bufferedOutputStream);
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.encrypt ? 1 : 0);
                if (this.encrypt) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.cipher.init(1, this.secretKeySpec, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.bufferedOutputStream, this.cipher));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    }
                }
            } catch (IOException e13) {
                e10 = e13;
                throw new Cache.CacheException(e10);
            } catch (Throwable th3) {
                th2 = th3;
                Util.closeQuietly(dataOutputStream);
                throw th2;
            }
        } catch (IOException e14) {
            e = e14;
        } catch (Throwable th4) {
            th = th4;
            Throwable th5 = th;
            dataOutputStream = dataOutputStream2;
            th2 = th5;
            Util.closeQuietly(dataOutputStream);
            throw th2;
        }
        try {
            try {
                dataOutputStream.writeInt(this.keyToContent.size());
                int iHeaderHashCode = 0;
                for (CachedContent cachedContent : this.keyToContent.values()) {
                    cachedContent.writeToStream(dataOutputStream);
                    iHeaderHashCode += cachedContent.headerHashCode(2);
                }
                dataOutputStream.writeInt(iHeaderHashCode);
                this.atomicFile.endWrite(dataOutputStream);
                Util.closeQuietly((Closeable) null);
            } catch (Throwable th6) {
                DataOutputStream dataOutputStream4 = dataOutputStream;
                th = th6;
                dataOutputStream2 = dataOutputStream4;
                Throwable th52 = th;
                dataOutputStream = dataOutputStream2;
                th2 = th52;
                Util.closeQuietly(dataOutputStream);
                throw th2;
            }
        } catch (IOException e15) {
            DataOutputStream dataOutputStream5 = dataOutputStream;
            e = e15;
            dataOutputStream3 = dataOutputStream5;
            IOException iOException = e;
            dataOutputStream = dataOutputStream3;
            e10 = iOException;
            throw new Cache.CacheException(e10);
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        if (getOrAdd(str).applyMetadataMutations(contentMetadataMutations)) {
            this.changed = true;
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f50071id;
    }

    public CachedContent get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<CachedContent> getAll() {
        return this.keyToContent.values();
    }

    public ContentMetadata getContentMetadata(String str) {
        CachedContent cachedContent = get(str);
        return cachedContent != null ? cachedContent.getMetadata() : DefaultContentMetadata.EMPTY;
    }

    public String getKeyForId(int i10) {
        return this.idToKey.get(i10);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public CachedContent getOrAdd(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    public void load() {
        Assertions.checkState(!this.changed);
        if (readFile()) {
            return;
        }
        this.atomicFile.delete();
        this.keyToContent.clear();
        this.idToKey.clear();
    }

    public void maybeRemove(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent == null || !cachedContent.isEmpty() || cachedContent.isLocked()) {
            return;
        }
        this.keyToContent.remove(str);
        this.idToKey.remove(cachedContent.f50071id);
        this.changed = true;
    }

    public void removeEmpty() {
        int size = this.keyToContent.size();
        String[] strArr = new String[size];
        this.keyToContent.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            maybeRemove(strArr[i10]);
        }
    }

    public void store() throws Throwable {
        if (this.changed) {
            writeFile();
            this.changed = false;
        }
    }

    public CachedContentIndex(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public CachedContentIndex(File file, byte[] bArr, boolean z10) {
        this.encrypt = z10;
        if (bArr != null) {
            Assertions.checkArgument(bArr.length == 16);
            try {
                this.cipher = getCipher();
                this.secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            Assertions.checkState(!z10);
            this.cipher = null;
            this.secretKeySpec = null;
        }
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.atomicFile = new AtomicFile(new File(file, FILE_NAME));
    }
}

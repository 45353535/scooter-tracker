package com.applovin.shadow.okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u0;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import mf.a;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lcom/applovin/shadow/okio/Path;", "Lcom/applovin/shadow/okio/internal/ZipEntry;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lcom/applovin/shadow/okio/ZipFileSystem;", "zipPath", "fileSystem", "Lcom/applovin/shadow/okio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lcom/applovin/shadow/okio/BufferedSource;", "readEocdRecord", "Lcom/applovin/shadow/okio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lcom/applovin/shadow/okio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
        Map<Path, ZipEntry> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (ZipEntry zipEntry : CollectionsKt.sortedWith(list, new Comparator() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (mapMutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = mapMutableMapOf.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapMutableMapOf.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mapMutableMapOf;
    }

    private static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Finally extract failed */
    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull Function1<? super ZipEntry, Boolean> predicate) throws IOException {
        long size;
        long j10;
        BufferedSource bufferedSourceBuffer;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            size = fileHandleOpenReadOnly.size() - ((long) 22);
        } finally {
        }
        if (size < 0) {
            throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
        }
        long jMax = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
        do {
            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
            try {
                if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                    EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                    String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                    bufferedSourceBuffer2.close();
                    long j11 = size - ((long) 20);
                    if (j11 > 0) {
                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j11));
                        try {
                            if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                int intLe = bufferedSourceBuffer.readIntLe();
                                long longLe = bufferedSourceBuffer.readLongLe();
                                if (bufferedSourceBuffer.readIntLe() != 1 || intLe != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                try {
                                    int intLe2 = bufferedSourceBuffer.readIntLe();
                                    if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                        throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                    }
                                    eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                    Unit unit = Unit.f93236a;
                                    c.a(bufferedSourceBuffer, null);
                                } finally {
                                }
                            }
                            Unit unit2 = Unit.f93236a;
                            c.a(bufferedSourceBuffer, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                    try {
                        long entryCount = eocdRecord.getEntryCount();
                        for (j10 = 0; j10 < entryCount; j10++) {
                            ZipEntry entry = readEntry(bufferedSourceBuffer);
                            if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (predicate.invoke(entry).booleanValue()) {
                                arrayList.add(entry);
                            }
                        }
                        Unit unit3 = Unit.f93236a;
                        c.a(bufferedSourceBuffer, null);
                        ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                        c.a(fileHandleOpenReadOnly, null);
                        return zipFileSystem;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                bufferedSourceBuffer2.close();
                size--;
            } finally {
                bufferedSourceBuffer2.close();
            }
        } while (size >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            function1 = new Function1<ZipEntry, Boolean>() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt.openZip.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ZipEntry it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        return openZip(path, fileSystem, function1);
    }

    @NotNull
    public static final ZipEntry readEntry(@NotNull final BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final u0 u0Var = new u0();
        u0Var.f93333b = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final u0 u0Var2 = new u0();
        u0Var2.f93333b = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        final u0 u0Var3 = new u0();
        u0Var3.f93333b = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (StringsKt.f0(utf8, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j10 = u0Var2.f93333b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (u0Var.f93333b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += (long) 8;
        }
        if (u0Var3.f93333b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += (long) 8;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(bufferedSource, shortLe4, new Function2<Integer, Long, Unit>() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt.readEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l10) throws IOException {
                invoke(num.intValue(), l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(int i11, long j11) throws IOException {
                if (i11 == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.f93279b) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.f93279b = true;
                    if (j11 < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    u0 u0Var4 = u0Var2;
                    long longLe = u0Var4.f93333b;
                    if (longLe == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                        longLe = bufferedSource.readLongLe();
                    }
                    u0Var4.f93333b = longLe;
                    u0 u0Var5 = u0Var;
                    u0Var5.f93333b = u0Var5.f93333b == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
                    u0 u0Var6 = u0Var3;
                    u0Var6.f93333b = u0Var6.f93333b == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
                }
            }
        });
        if (j10 <= 0 || ref$BooleanRef.f93279b) {
            return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), StringsKt.M(utf8, "/", false, 2, null), bufferedSource.readUtf8(shortLe5), intLe2, u0Var.f93333b, u0Var2.f93333b, shortLe2, lDosDateTimeToEpochMillis, u0Var3.f93333b);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    @NotNull
    public static final FileMetadata readLocalHeader(@NotNull BufferedSource bufferedSource, @NotNull FileMetadata basicMetadata) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        Intrinsics.checkNotNull(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final FileMetadata readOrSkipLocalHeader(final BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new Function2<Integer, Long, Unit>() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt.readOrSkipLocalHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l10) throws IOException {
                invoke(num.intValue(), l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(int i11, long j10) throws IOException {
                if (i11 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                    if (j10 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b10 = bufferedSource.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    BufferedSource bufferedSource2 = bufferedSource;
                    long j11 = z10 ? 5L : 1L;
                    if (z11) {
                        j11 += 4;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (j10 < j11) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        ref$ObjectRef.f93280b = Long.valueOf(((long) bufferedSource2.readIntLe()) * 1000);
                    }
                    if (z11) {
                        ref$ObjectRef2.f93280b = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                    if (z12) {
                        ref$ObjectRef3.f93280b = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                }
            }
        });
        return new FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (Long) ref$ObjectRef3.f93280b, (Long) ref$ObjectRef.f93280b, (Long) ref$ObjectRef2.f93280b, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}

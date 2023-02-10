package com.example.workbook.ch4;

import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.io.InputStream;

public class P82_VarAndLackOfInformation {
    public void playground(){
        try (MemoryCacheImageInputStream is = new MemoryCacheImageInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        })) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fm = jc.getStandardFileManager(null, null, null);

        var inputStream = new MemoryCacheImageInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        var compiler = ToolProvider.getSystemJavaCompiler();
        var fileManager = compiler.getStandardFileManager(null, null, null);





    }
}

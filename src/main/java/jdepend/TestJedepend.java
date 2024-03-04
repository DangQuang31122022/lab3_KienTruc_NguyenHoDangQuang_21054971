package jdepend;

import jdepend.framework.PackageFilter;
import jdepend.xmlui.JDepend;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TestJedepend {
    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("results.xml")))
        {
//            jdepend.swingui.JDepend xml = new jdepend.swingui.JDepend();
            JDepend xml = new JDepend(out);
            xml.addDirectory("D:\\17d\\kientruc\\tuan4\\ex3");
            PackageFilter f = PackageFilter.all();
// f.including("vn.edu.iuh");
//            f.accept("vn.edu");
//            f.excluding("org");
//            xml.setFilter(f);
            xml.analyze();
        }
    }
}

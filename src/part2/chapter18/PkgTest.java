package part2.chapter18;

// Применение класса Package
public class PkgTest {
    public static void main(String[] args) {
        Package pkgs[];

        pkgs = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(pkgs[i].getName() + " " + pkgs[i].getImplementationTitle() + " " +
                    pkgs[i].getImplementationVendor() + " " + pkgs[i].getImplementationVersion());
        }
    }
}

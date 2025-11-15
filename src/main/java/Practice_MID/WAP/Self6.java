package Practice_MID.WAP;

class CloudStorage {
    String accountEmail;
    double usedSpace;
    double maxSpace;

    CloudStorage(String accountEmail, double maxSpace) {
        this.accountEmail = accountEmail;
        this.maxSpace = maxSpace;
        this.usedSpace = 0;
    }

    // upload file
    public void uploadFile(double size) {
        if (usedSpace + size > maxSpace) {
            System.out.println("❌ Upload failed: Not enough storage!");
        } else {
            usedSpace += size;
            System.out.println("✔ Uploaded " + size + " GB");
        }
    }

    // delete file
    public void deleteFile(double size) {
        if (size > usedSpace) {
            System.out.println("❌ Delete failed: Size exceeds used space!");
        } else {
            usedSpace -= size;
            System.out.println("✔ Deleted " + size + " GB");
        }
    }

    // print storage info
    public void storageInfo() {
        System.out.println("Account: " + accountEmail +
                " | Used: " + usedSpace + " GB" +
                " | Max: " + maxSpace + " GB");
    }
}

// ---------------- CHILD 1 ----------------
class FreeCloud extends CloudStorage {
    FreeCloud(String email) {
        super(email, 15); // maxSpace = 15 GB
    }
}

// ---------------- CHILD 2 ----------------
class ProCloud extends CloudStorage {
    ProCloud(String email) {
        super(email, 100); // maxSpace = 100 GB
    }

    // extra method
    public void bonusSpace(int extra) {
        maxSpace += extra;
        System.out.println("🎁 Bonus added: " + extra + " GB");
    }
}


// ---------------- MAIN ----------------
public class Self6 {
    public static void main(String[] args) {

        FreeCloud free = new FreeCloud("free@gmail.com");
        ProCloud pro = new ProCloud("pro@gmail.com");

        // upload & delete operations
        free.uploadFile(8);
        free.uploadFile(10);  // should fail
        free.deleteFile(3);

        pro.uploadFile(50);
        pro.deleteFile(10);

        // add bonus to ProCloud
        pro.bonusSpace(20);

        // final storage info
        System.out.println("\n=== FINAL STORAGE INFO ===");
        free.storageInfo();
        pro.storageInfo();
    }
}

package aquarius0715.takarakuzi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Random;

public final class Takarakuzi extends JavaPlugin implements Listener {

    public Inventory inv;
    String prefix = "[ジェネレーター君]";

    ArrayList<String> loto3 = new ArrayList<String>();
    ArrayList<String> loto4 = new ArrayList<String>();
    ArrayList<String> loto5 = new ArrayList<String>();
    ArrayList<String> loto6 = new ArrayList<String>();
    ArrayList<String> loto7 = new ArrayList<String>();


    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        createInv();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("takarakuzi")) {
            if (!(sender instanceof Player)) {
                Player player = (Player) sender;
                sender.sendMessage("You cannot this");
                return true;
            }
        }

        if (args.length == 0) {
            Player player = (Player) sender;
            //open inventory
            player.openInventory(inv);
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("loto3")) {
                sender.sendMessage("ロト3過去の排出番号");
                for (String s : loto3) {
                    sender.sendMessage(s);
                }
                return true;
            }
            if (args[0].equalsIgnoreCase("loto4")) {
                sender.sendMessage("ロト4過去の排出番号");
                for (String s : loto4) {
                    sender.sendMessage(s);
                }
                return true;
            }
            if (args[0].equalsIgnoreCase("loto5")) {
                sender.sendMessage("ロト5過去の排出番号");
                for (String s : loto5) {
                    sender.sendMessage(s);
                }
                return true;
            }
            if (args[0].equalsIgnoreCase("loto6")) {
                sender.sendMessage("ロト6過去の排出番号");
                for (String s : loto6) {
                    sender.sendMessage(s);
                }
                return true;
            }
            if (args[0].equalsIgnoreCase("loto7")) {
                sender.sendMessage("ロト7過去の排出番号");
                for (String s : loto7) {
                    sender.sendMessage(s);
                }
                return true;
            }
        }
        if (args[0].equalsIgnoreCase("help")) {
            sender.sendMessage("=================宝くじジェネレータープラグイン================");
            sender.sendMessage("/takarakuzi 宝くじGUIを開きます");
            sender.sendMessage("/takarakuzi loto<number> 知りたいロトの過去排出番号が見れます");
            sender.sendMessage("=================宝くじジェネレータープラグイン================");
            return true;
        }
        return false;
    }

    @EventHandler()
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(inv)) return;
        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getItemMeta() == null) return;
        if (event.getCurrentItem().getItemMeta().getDisplayName() == null) return;

        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();

        switch (event.getSlot()) {

            case 0:
                int n1 = new Random().nextInt(9);
                int n2 = new Random().nextInt(9);
                int n3 = new Random().nextInt(9);
                player.sendMessage(prefix + "ロト3、貴方の番号は" + n1 + "、" + n2 + "、" + n3 + "です");
                String score = Integer.toString(n1);
                String score1 = Integer.toString(n2);
                String score2 = Integer.toString(n3);
                String result = prefix + "番号は" + score + "、" + score1 + "、" + score2;
                loto3.add(result);
                player.closeInventory();
                break;

            case 2:
                int n4 = new Random().nextInt(9);
                int n5 = new Random().nextInt(9);
                int n6 = new Random().nextInt(9);
                int n7 = new Random().nextInt(9);
                player.sendMessage(prefix + "ロト4、貴方の番号は" + n4 + "、" + n5 + "、" + n6 + "、" + n7 + "です");
                String score4 = Integer.toString(n4);
                String score5 = Integer.toString(n5);
                String score6 = Integer.toString(n6);
                String score7 = Integer.toString(n7);
                String result1 = prefix + "番号は" + score4 + "、" + score5 + "、" + score6 + "、" + score7;
                loto4.add(result1);
                player.closeInventory();
                break;

            case 4:
                int n9 = new Random().nextInt(31);
                int n10 = new Random().nextInt(31);
                int n11 = new Random().nextInt(31);
                int n12 = new Random().nextInt(31);
                int n13 = new Random().nextInt(31);
                player.sendMessage(prefix + "ロト5、貴方の番号は" + n9++ + "、" + n10++ + "、" + n11++ + "、" + n12++ + "、" + n13++ + "です");
                String score8 = Integer.toString(n9);
                String score9 = Integer.toString(n10);
                String score10 = Integer.toString(n11);
                String score11 = Integer.toString(n12);
                String score12 = Integer.toString(n13);
                String result3 = prefix + "番号は" + score8 + "、" + score9 + "、" + score10 + "、" + score11 + "、" + score12;
                loto5.add(result3);
                player.closeInventory();
                break;

            case 6:
                int n14 = new Random().nextInt(43);
                int n15 = new Random().nextInt(43);
                int n16 = new Random().nextInt(43);
                int n17 = new Random().nextInt(43);
                int n18 = new Random().nextInt(43);
                int n19 = new Random().nextInt(43);
                player.sendMessage(prefix + "ロト6、貴方の番号は" + n14++ + "、" + n15++ + "、" + n16++ + "、" + n17++ + "、" + n18++ + "、" + n19++ + "です");
                String score13 = Integer.toString(n14);
                String score14 = Integer.toString(n15);
                String score15 = Integer.toString(n16);
                String score16 = Integer.toString(n17);
                String score17 = Integer.toString(n18);
                String score18 = Integer.toString(n19);
                String result4 = prefix + "番号は" + score13 + "、" + score14 + "、" + score15 + "、" + score16 + "、" + score17 + "、" + score18;
                loto6.add(result4);
                player.closeInventory();
                break;

            case 8:
                int n20 = new Random().nextInt(37);
                int n21 = new Random().nextInt(37);
                int n22 = new Random().nextInt(37);
                int n23 = new Random().nextInt(37);
                int n24 = new Random().nextInt(37);
                int n25 = new Random().nextInt(37);
                int n26 = new Random().nextInt(37);
                player.sendMessage(prefix + "ロト7、貴方の番号は" + n20++ + "、" + n21++ + "、" + n22++ + "、" + n23++ + "、" + n24++ + "、" + n25++ + "、" + n26++ + "です");
                String score19 = Integer.toString(n20);
                String score20 = Integer.toString(n21);
                String score21 = Integer.toString(n22);
                String score22 = Integer.toString(n23);
                String score23 = Integer.toString(n24);
                String score24 = Integer.toString(n25);
                String score25 = Integer.toString(n26);
                String result5 = prefix + "番号は" + score19 + "、" + score20 + "、" + score21 + "、" + score22 + "、" + score23 + "、" + score24 + "、" + score25;
                loto7.add(result5);
                player.closeInventory();
                break;
        }
    }

    public void createInv() {
        //create new inventory
        inv = Bukkit.createInventory(null, 9, ChatColor.GOLD + "" + ChatColor.BOLD + "宝くじ決めちゃう君");

        //GUIの根幹変数

        ItemStack gui = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
        ItemMeta gui_meta = gui.getItemMeta();
        ItemStack button = new ItemStack(Material.NOTE_BLOCK);
        ItemMeta button_meta = button.getItemMeta();

        //ロト3の作成
        button_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "ここをクリックしてロト3の番号を決める");
        button.setItemMeta(button_meta);
        inv.setItem(0, button);

        //ロト4の作成
        button_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "ここをクリックしてロト4の番号を決める");
        button.setItemMeta(button_meta);
        inv.setItem(2, button);
        //ロト5の作成
        button_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "ここをクリックしてロト5の番号を決める");
        button.setItemMeta(button_meta);
        inv.setItem(4, button);

        //ロト6の作成
        button_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "ここをクリックしてロト6の番号を決める");
        button.setItemMeta(button_meta);
        inv.setItem(6, button);

        //ロト7の作成
        button_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "ここをクリックしてロト7の番号を決める");
        button.setItemMeta(button_meta);
        inv.setItem(8, button);

        //余白
        gui_meta.setDisplayName(" ");
        gui.setItemMeta(gui_meta);
        inv.setItem(1, gui);
        inv.setItem(3, gui);
        inv.setItem(5, gui);
        inv.setItem(7, gui);
    }
}

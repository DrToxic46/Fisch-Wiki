import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class FischWikiApp extends JFrame {

    public FischWikiApp() {
        setTitle("Fisch Wiki - Official Rod & Mutation Database");
        setSize(1200, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Fishing Rods", createRodsPanel());
        tabs.addTab("Mutations", createMutationsPanel());

        add(tabs);
    }

    private JPanel createRodsPanel() {
        List<Rod> rods = new ArrayList<>();
        // ROD DATA EXTRACTED IN EXACT ORDER FROM Rods.pdf
        rods.add(new Rod("Flimsy Rod", "0", "0", "0", "10.4 kg", "Starter rod.")); // [cite: 1]
        rods.add(new Rod("Training Rod", "300", "10", "-70", "9 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Plastic Rod", "750", "10", "15", "100 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Carbon Rod", "2,000", "15", "25", "600 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Long Rod", "3,000", "20", "80", "250 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Fast Rod", "4,000", "70", "10", "N/A", "None.")); // [cite: 1]
        rods.add(new Rod("Lucky Rod", "4,500", "20", "177", "N/A", "None.")); // [cite: 1]
        rods.add(new Rod("Stone Rod", "2,000", "-5", "40", "50,000 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Phoenix Rod", "50,000", "55", "80", "8,000 kg", "None.")); // [cite: 1]
        rods.add(new Rod("Steady Rod", "7,000", "-60", "35", "250,000 kg", "Increases shake button size.")); // [cite: 2]
        rods.add(new Rod("Fortune Rod", "11,000", "30", "200", "3,000 kg", "None.")); // [cite: 2]
        rods.add(new Rod("Rapid Rod", "12,000", "89", "49", "800 kg", "None.")); // [cite: 2]
        rods.add(new Rod("Magnet Rod", "15,000", "-10", "0", "10,000 kg", "Greatly increases Crate chances.")); // [cite: 2]
        rods.add(new Rod("Wildflower Rod", "7,000", "70", "75", "700 kg", "30% chance to catch Mother Nature (3x Value).")); // [cite: 2]
        rods.add(new Rod("Eidolon Rod", "2,000,000", "100", "50", "Infinite", "+40% Progress Speed; 35% chance for Phantom (4.5x). Sets Progress Speed to +666% and Control to 0.7 after 70% Progress.")); // [cite: 2, 3]
        rods.add(new Rod("Dreambreaker", "5,000,000", "120", "215", "Infinite", "+15% Progress Speed; Day: -50% Weight; Night: +50% Weight, 35% chance for Distraught (8.5x).")); // [cite: 2, 3]
        rods.add(new Rod("Nocturnal Rod", "11,000", "50", "70", "10,000 kg", "Removes time preference Luck penalty.")); // [cite: 3]
        rods.add(new Rod("Aurora Rod", "70,000", "45", "60", "6,000 kg", "15% chance for Aurora (6.5x); 30% during Aurora Borealis.")); // [cite: 3]
        rods.add(new Rod("Precision Rod", "12,000", "20", "150", "15 kg", "None.")); // [cite: 4]
        rods.add(new Rod("Wisdom Rod", "2,000", "55", "80", "2,000 kg", "+5% XP for perfect streak; -10% XP for failed.")); // [cite: 4]
        rods.add(new Rod("Resourceful Rod", "1,000", "30", "60", "1,000 kg", "Doubles bait effect; 60% chance to save bait.")); // [cite: 4]
        rods.add(new Rod("Voyager Rod", "300,000", "45", "85", "N/A", "Laser fills 20% progress; 35% chance for Fossilized (2.5x).")); // [cite: 4]
        rods.add(new Rod("Riptide Rod", "3,500", "60", "100", "3,500 kg", "After 3 perfect catches: 5 enhanced casts (+30% Luck, +25% Lure Speed).")); // [cite: 4]
        rods.add(new Rod("Seasons Rod", "8,000", "25", "70", "8,000 kg", "Receive seasonal bonuses based on current Season.")); // [cite: 4]
        rods.add(new Rod("The L Rod", "55,000", "45", "90", "55,000 kg", "36% chance for special catch (5.5x).")); // [cite: 4]
        rods.add(new Rod("Arctic Rod", "25,000", "25", "45", "7,500 kg", "All fish caught are Frozen (1.3x).")); // [cite: 4, 5]
        rods.add(new Rod("Ice Warpers Rod", "65,000", "50", "60", "75,000 kg", "25% chance for Blighted (3x).")); // [cite: 4, 5]
        rods.add(new Rod("Avalanche Rod", "35,000", "40", "68", "65,000 kg", "25% chance for Sleet (2.4x).")); // [cite: 5]
        rods.add(new Rod("Crystalized Rod", "35,000", "35", "45", "25,000 kg", "20% chance for Crystalized (3x).")); // [cite: 5]
        rods.add(new Rod("Summit Rod", "500,000", "45", "75", "200,000 kg", "40% Frozen, 20% Sleet, 15% Blighted; +10% Progress Speed.")); // [cite: 5]
        rods.add(new Rod("Scurvy Rod", "40,000", "25", "50", "2,000 kg", "15% chance for Greedy (4x).")); // [cite: 6]
        rods.add(new Rod("Tempest Rod", "500,000", "90", "120", "80,000 kg", "+15% progress speed.")); // [cite: 6]
        rods.add(new Rod("Abyssal Specter Rod", "850,000", "60", "90", "Infinite", "+20% weight buff; 25% chance for Abyssal (3.5x).")); // [cite: 7]
        rods.add(new Rod("Poseidon Rod", "700,000", "50", "165", "100,000 kg", "25% chance for 75% base value; 10% chance for King's Blessing (5.5x).")); // [cite: 7]
        rods.add(new Rod("Zeus Rod", "850,000", "70", "90", "65,000 kg", "10% thunderstorm chance; 90% Electric Shock (3.5x) in storms.")); // [cite: 7, 8]
        rods.add(new Rod("Kraken Rod", "950,000", "60", "185", "115,000 kg", "20% double fish; 10% double with Tentacle Surge (7.8x).")); // [cite: 8]
        rods.add(new Rod("Depthseeker Rod", "40,000", "55", "70", "70,000 kg", "+5% Progress Speed.")); // [cite: 9]
        rods.add(new Rod("Champions Rod", "90,000", "45", "65", "100,000 kg", "None.")); // [cite: 9]
        rods.add(new Rod("Reinforced Rod", "20,000", "40", "65", "Infinite", "Enables fishing in Roslit Volcano/Brine Pool.")); // [cite: 9]
        rods.add(new Rod("The Boom Ball", "50,000", "0", "0", "500,000,000 kg", "50% chance for Exploded (0.1x); +100% Progress Speed.")); // [cite: 9]

        return createUI(rods);
    }

    private JPanel createMutationsPanel() {
        List<Mutation> muts = new ArrayList<>();
        // MUTATION DATA EXTRACTED IN EXACT ORDER FROM Mutations.pdf
        muts.add(new Mutation("Tryhard", "10x", "Translucent red, bright sparkling particles.", "Tryhard Rod (100% chance).")); // [cite: 138]
        muts.add(new Mutation("Fabulous", "9.6x", "Vibrant glow, covered in smoke and emits sparkles.", "Fabulous Rod (26% chance).")); // [cite: 138]
        muts.add(new Mutation("Permafrost", "9.5x", "Bright white with snowflake particles.", "North Pole (25% chance).")); // [cite: 138]
        muts.add(new Mutation("Darkness", "9.4x", "Dark silhouette.", "Sword Of Darkness (100% chance during passive).")); // [cite: 138]
        muts.add(new Mutation("Frostbitten", "9x", "Dark blue with snowy particles.", "Maelstrom Rod (30% chance).")); // [cite: 138]
        muts.add(new Mutation("Mastered", "9x", "Translucent changing between blue/red with gleaming particles.", "Luminescent/Ruinous Oath (100% perfect catch).")); // [cite: 139]
        muts.add(new Mutation("Umbra", "9x", "Orange, black, and blue with a large black hole.", "Fang of the Eclipse during Eclipse (10%).")); // [cite: 139]
        muts.add(new Mutation("Mossy", "8.7x", "Dark green, mossy texture, sparkling green particles.", "Elder Mossripper (5% or every 2 mins).")); // [cite: 139]
        muts.add(new Mutation("Puritas", "8.7x", "Light blue shades, ringed with butterflies.", "Onirifalx (3% chance).")); // [cite: 140]
        muts.add(new Mutation("Breezed", "8.6x", "Yellow and white colors, rocky texture.", "Wind Elemental (25% chance).")); // [cite: 140]
        muts.add(new Mutation("Distraught", "8.5x", "Black and white, distorted effect.", "Dreambreaker (25% day / 35% night).")); // [cite: 140]
        muts.add(new Mutation("Blessed", "8.5x", "Bright white/yellow neon, winged particle center.", "Seraphic Rod (30% chance).")); // [cite: 140]
        muts.add(new Mutation("Serene", "8.5x", "Darker blue with trailing particles.", "Polaris Serenade (20%) or Duskwire (2-4%).")); // [cite: 141]
        muts.add(new Mutation("Gleebous", "8x", "Neon green with green particles.", "Blade Of Glorp (23%) or UFO crash (5%).")); // [cite: 141]
        muts.add(new Mutation("Glacial", "8x", "White/light blue, snowy texture with snowflakes.", "Frostbane Rod (1-10%) or Admin Events.")); // [cite: 141]
        muts.add(new Mutation("Glowy", "8x", "Grayish-white, very bright.", "Glowworm bait (100%) or Noctone (40%).")); // [cite: 142]
        muts.add(new Mutation("Nocturnal", "8x", "Completely dark, obsidian textures.", "Wingripper during night (7% chance).")); // [cite: 142]
        muts.add(new Mutation("Atomic", "8x", "Bright yellow with multiple neon particles.", "Atomic Nuke radius (100% chance).")); // [cite: 142]
        muts.add(new Mutation("Chaotic", "8x", "Partially translucent black and white, emits particles.", "Chaotic enchant, Duskwire (30-98%), or Axe of Rhoads (5%).")); // [cite: 142]
        muts.add(new Mutation("Tentacle Surge", "7.8x", "Grainy midnight blue texture.", "Kraken Rod (5% chance).")); // [cite: 143]
        muts.add(new Mutation("Jackpot", "7.77x", "Bright yellow and green glow.", "Random Rod (50% chance).")); // [cite: 143]
        muts.add(new Mutation("Magical", "7.2x", "Purple with a sandy texture.", "Merlin's Staff (25% chance).")); // [cite: 143]
        muts.add(new Mutation("Infernal", "7x", "Bright orange, rocky texture, blazing fire particles.", "Cinderstring (5-15% chance).")); // [cite: 143]
        muts.add(new Mutation("Flora", "7x", "Purple with sandy texture and circling butterflies.", "Chrysalis (8-100% chance).")); // [cite: 143]
        muts.add(new Mutation("Diurnal", "7x", "Completely dark, obsidian textures.", "Wingripper during day (27% chance).")); // [cite: 144]
        muts.add(new Mutation("Sacratus", "7x", "Two shades of light blue with a star.", "Onirifalx (7% chance).")); // [cite: 144]
        muts.add(new Mutation("Shrouded", "7x", "Translucent forest-green, many particles.", "Elder Mossripper (25%) or Appraisal.")); // [cite: 144]
        muts.add(new Mutation("Tidal", "7x", "Light blue with water particles.", "Rod of the Forgotten Fang (25% chance).")); // [cite: 144]
        muts.add(new Mutation("Evil", "6.5x", "Red with lightning and evil face particles.", "Evil Pitchfork (20% chance).")); // [cite: 144]
        muts.add(new Mutation("Luminescent", "6.5x", "Translucent with sandy texture.", "Luminescent/Ruinous Oath (100% perfect catch).")); // [cite: 145]
        muts.add(new Mutation("Aurora", "6.5x", "Pastel neon pink, RGB glow.", "Aurora Rod or Bait (15-30% chance).")); // [cite: 145]
        muts.add(new Mutation("Oscar", "6.4x", "Mixture of red and yellow accents.", "Great Rod Of Oscar (5% chance).")); // [cite: 145]
        muts.add(new Mutation("Sunken", "6.3x", "Dark green, green smoke and runic symbols.", "Sunken Rod (5%) or Treasure Chests (3.83%).")); // [cite: 145]
        muts.add(new Mutation("Toxic", "6x", "Purple, magma texture with bubbles.", "Toxic Spire Rod (15% chance).")); // [cite: 146]
        muts.add(new Mutation("Nuclear", "6x", "Radioactive uranium green with bright glow.", "Nuke/Cursed Nuke explosion waters (100%).")); // [cite: 146]
        muts.add(new Mutation("Snowy", "6x", "Light blue with floating snowflakes.", "Fallen Snowblade (5-45% chance).")); // [cite: 146]
        muts.add(new Mutation("Chilled", "6x", "White-cyan, steam effects.", "Frostbane Rod (10-30%) or Admin Events.")); // [cite: 146]
        muts.add(new Mutation("Nova", "6x", "White and purple mixture.", "Rod of Cosmos, Cerulean Fang, or Starfall (5%).")); // [cite: 147]
        muts.add(new Mutation("Heavenly", "6x", "Pastel neon yellow with camera-facing crucifix.", "Heaven's Rod (35% chance).")); // [cite: 147]
        muts.add(new Mutation("Subspace", "6x", "Pink-purple with dark-pink sparkles.", "Quantum enchantment (25% chance).")); // [cite: 147]
        muts.add(new Mutation("Anomalous", "5.55x", "Red glitchy particles.", "Anomalous enchantment (20% chance).")); // [cite: 147]
        muts.add(new Mutation("King's Blessing", "5.5x", "Crown on head; 75-150% larger with Poseidon Rod.", "Poseidon Rod (10% chance).")); // [cite: 150]
        muts.add(new Mutation("Mythical", "5.5x", "Certain parts glow like Sparkling.", "Mythical Rod (30% chance).")); // [cite: 151]
        muts.add(new Mutation("Abyssal", "5.5x", "Neon blue with emitting particles.", "Abyssal Specter or Rod of Depths (25-30%).")); // [cite: 152, 153]
        muts.add(new Mutation("Prismize", "5.5x", "Glassy, shifting magenta, black, and purple.", "Ethereal Prism Rod (50% chance).")); // [cite: 154, 155]
        muts.add(new Mutation("Spirit", "5.2x", "Translucent purple.", "Spiritbinder (15%) or Appraisal (0.05%).")); // [cite: 155, 156]
        muts.add(new Mutation("Siren's Spite", "5x", "Dark red with red crown; overrides other mutations.", "Evil Pitchfork (25% chance).")); // [cite: 157, 158]
        muts.add(new Mutation("Rainbow Cluster", "5x", "Glows rainbow colors.", "Rainbow Cluster Rod (20-35% during Rainbow).")); // [cite: 159, 160]
        muts.add(new Mutation("Levitas", "5x", "Pure white.", "Onirifalx (50% chance).")); // [cite: 160]
        muts.add(new Mutation("Cursed Touch", "5x", "Neon green.", "Great Dreamer Rod (20% chance).")); // [cite: 160, 161]
        muts.add(new Mutation("Nico's Nyantics", "5x", "Pink/blue with paw and confetti particles.", "Nico's Yarncaster (25% chance).")); // [cite: 161, 162]
        muts.add(new Mutation("Gemstone", "5x", "Multi-color mixture with glassy texture.", "Treasure Rod (20% chance).")); // [cite: 162, 163]
        muts.add(new Mutation("Sanguine", "5x", "Blood red.", "Blood Reckoning or Sanguine Spire (30%).")); // [cite: 163, 164]
        muts.add(new Mutation("Carrot", "5x", "Orange and green colors.", "Carrot Rod or Carrot Pool (15% chance).")); // [cite: 164, 165]
        muts.add(new Mutation("Ashen Fortune", "5x", "Lava-like appearance.", "Volcanic Rod (20%) or Magma Rod (5%).")); // [cite: 166, 167]
        muts.add(new Mutation("Emberflame", "5x", "Blazing flame.", "Blazebringer Rod (5% chance).")); // [cite: 167]
        muts.add(new Mutation("Colossal Ink", "5x", "Light blue appearance.", "Colossal Ink Bait (100% chance).")); // [cite: 167, 168]
        muts.add(new Mutation("Galactic", "5x", "Black with large golden aura.", "Astrolure Bait (100% chance).")); // [cite: 168, 169]
        muts.add(new Mutation("Lobster", "5x", "Dark shade of red.", "Lobster Rod (30% chance).")); // [cite: 169, 170]
        muts.add(new Mutation("Nullified", "5x", "Rainbow neon color with rainbow glitchy aura.", "Nullbit Bait (100% chance).")); // [cite: 170, 171]
        muts.add(new Mutation("Greedy", "5x", "Dark gold, glowing yellow with rays.", "Rod of The Eternal King (60%) or Scurvy Rod (13%).")); // [cite: 171, 172]

        return createUI(muts);
    }

    private JPanel createUI(List<? extends Item> items) {
        JPanel p = new JPanel(new BorderLayout());
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Item i : items) model.addElement(i.name);

        JList<String> list = new JList<>(model);
        JTextArea area = new JTextArea("Select an item to view full details...");
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(new Font("Monospaced", Font.BOLD, 16));
        area.setBackground(new Color(245, 245, 245));

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                area.setText(items.get(list.getSelectedIndex()).info());
            }
        });

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(list), new JScrollPane(area));
        split.setDividerLocation(350);
        p.add(split, BorderLayout.CENTER);
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FischWikiApp().setVisible(true));
    }

    abstract static class Item { String name; abstract String info(); }

    static class Rod extends Item {
        String p, lu, ls, w, pass;
        Rod(String n, String pr, String luk, String lur, String we, String pas) {
            name=n; p=pr; lu=luk; ls=lur; w=we; pass=pas;
        }
        String info() { return String.format("--- ROD: %s ---\nPrice: %s C$\nLuck: +%s%%\nLure Speed: %s\nMax Weight: %s\n\nPASSIVE ABILITY:\n%s", name, p, lu, ls, w, pass); }
    }

    static class Mutation extends Item {
        String mult, app, obtain;
        Mutation(String n, String m, String a, String o) {
            name=n; mult=m; app=a; obtain=o;
        }
        String info() { return String.format("--- MUTATION: %s ---\nValue Multiplier: %s\n\nAPPEARANCE:\n%s\n\nOBTAINED VIA:\n%s", name, mult, app, obtain); }
    }
}

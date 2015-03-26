import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	public int q, q1, q2, q3, q4;
	public int n0 = 0;
	public int n1 = 0;
	public int n2 = 0;
	public int n3 = 0;
	public int n4 = 0;
	int size = q;
	int c;
	public LinkedList<String> coke;
	LinkedList<String> hersheysBar;
	LinkedList<String> waterBottles;
	LinkedList<String> gums;
	LinkedList<String> chipsPackets;

	public void displayAllProducts() {
		HashSet<String> product = new HashSet<String>();
		product.add("COKE");
		product.add("HERSHEYS");
		product.add("WATER");
		product.add("GUM");
		product.add("CHIPS");
		// Displaying all the products available
		Iterator<String> it = product.iterator();
		System.out.println("The products available are:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void Coke() {
		coke = new LinkedList<String>();
		coke.add("coke1");
		coke.add("coke2");
		coke.add("coke3");
		coke.add("coke4");
		coke.add("coke5");
		q = coke.size();
		System.out.println("Number of coke tins available are" + q);

	}

	// method to remove purchased cokes from list.
	public int removeCoke(int n00) {

		for (c = 0; c < n00; c++) {
			coke.remove(0);

			size = coke.size();
			q = size;
		}
		if (q == 0)
			System.out.println("no cokes available");
		return q;

	}

	public void hersheysBar() {
		hersheysBar = new LinkedList<String>();
		hersheysBar.add("hersheys1");
		hersheysBar.add("hersheys2");
		hersheysBar.add("hersheys3");
		hersheysBar.add("hersheys4");
		hersheysBar.add("hersheys5");
		hersheysBar.add("hersheys6");
		q1 = hersheysBar.size();
		// Displaying number of HersheysBars available
		System.out.println("Number of hersheysBars available are: " + q1);
	}

	// method to remove purchased Hersheys bars from list.
	public int removeHersheys(int n01) {
		for (c = 0; c < n01; c++) {
			hersheysBar.remove(0);

			size = hersheysBar.size();
			q1 = size;
		}
		if (q1 == 0)
			System.out.println("No HersheysBars available");
		return q1;

	}

	public void waterbottles() {
		waterBottles = new LinkedList<String>();
		waterBottles.add("waterBottles1");
		waterBottles.add("waterBottles2");
		waterBottles.add("waterBottles3");
		waterBottles.add("waterBottles4");
		waterBottles.add("waterBottles5");
		q2 = waterBottles.size();
		// Displaying number of waterbottles available
		System.out.println("Number of waterBottles available are: " + q2);
	}

	// method to remove the number of purchased water bottles from the list.
	public int removeWaterbottle(int n02) {
		for (c = 0; c < n02; c++) {
			waterBottles.remove(0);

			size = waterBottles.size();
			q2 = size;
		}
		if (q2 == 0)
			System.out.println("No Water bottles available");
		return q2;

	}

	public void gum() {
		gums = new LinkedList<String>();
		gums.add("gum1");
		gums.add("gum2");
		gums.add("gum3");
		gums.add("gum4");
		gums.add("gum5");
		q3 = gums.size();
		// Displaying number of Gums available
		System.out.println("Number of gums available are: " + q3);
	}

	// method to remove the number of purchased gums from the list
	public int removeGum(int n03) {
		for (c = 0; c < n03; c++) {
			gums.remove(0);

			size = gums.size();
			q3 = size;
		}
		if (q3 == 0)
			System.out.println("No Gums available");
		return q3;

	}

	public void chips() {
		chipsPackets = new LinkedList<String>();
		chipsPackets.add("chipsPacket1");
		chipsPackets.add("chipsPacket2");
		chipsPackets.add("chipsPacket3");
		chipsPackets.add("chipsPacket4");
		chipsPackets.add("chipsPacket5");
		q4 = chipsPackets.size();
		// Displaying the number of Chips available
		System.out.println("Number of chipsPackets available are: " + q4);
	}

	// method to remove number of purchased chips packets from the list.
	public int removeChips(int n04) {
		for (c = 0; c < n04; c++) {
			chipsPackets.remove(0);

			size = chipsPackets.size();
			q4 = size;
		}
		if (q4 == 0)
			System.out.println("No Chips packets available");
		return q4;

	}

	public void enterValue() {

		int t = 0;
		int p;
		int i;
		int r;
		int j;
		Scanner scan = new Scanner(System.in);
		for (i = 0; i >= 0; i++) {
			int s = scan.nextInt();

			switch (s) {

			case 0:
				System.out.println("Coke is Selected");
				for (j = 0; j >= 0; j++) {
					System.out.println("Number of coke tins available are" + q);
					System.out.println("Enter number coke tins you need");
					n0 = scan.nextInt();

					if ((n0 <= q) && (n0 != 0)) {
						t = n0 * 2;
						System.out.println("Insert  " + t + " coins");
						for (r = 0; r >= 0; r++) {
							p = scan.nextInt();
							if (p == t) {
								System.out.println("Transaction completed"
										+ "Please collect  " + n0
										+ "  coke tins");
								System.out
										.println("Enter numbers between 0 and 4 to continue purchase or enter 5 to end purchase");
								r = 0;
								break;
							} else {
								System.out.println("Amount not sufficient");

							}
						}
						removeCoke(n0);// calls method to remove the number of
										// coke tins purchased from the list.
						j = 0;
						break;
					} else

						System.out.println("Number of coke tins available are"
								+ q);
					System.out.println("Enter available quantity");
				}

				break;
			case 1:
				System.out.println("Hersheys Bar is Selected");
				for (j = 0; j >= 0; j++) {
					System.out
							.println("Number of Hersheys Bars available are: "
									+ q1);
					System.out
							.println("Enter the number of Hersheys bars you need");
					n1 = scan.nextInt();

					if ((n1 <= q1) && (n1 != 0)) {
						t = n1 * 3;
						System.out.println("Insert  " + t + " coins");
						for (r = 0; r >= 0; r++) {
							p = scan.nextInt();
							if (p == t) {
								System.out.println("Transaction completed"
										+ "Please collect  " + n1
										+ "  Hersheys Bars");
								System.out
										.println("Enter numbers between 0 and 4 to continue purchase or enter 5 to end purchase");
								r = 0;
								break;
							} else {
								System.out.println("Amount not sufficient");

							}
						}
						removeHersheys(n1);// calls the method to remove the
											// purchsaed number of hersheys bars
											// from the list
						j = 0;
						break;
					} else
						System.out
								.println("Number of Hersheys Bars available are: "
										+ q1);
					System.out.println("Enter available quantity");
				}
				break;
			case 2:
				System.out.println("Water Bottle is Selected");
				for (j = 0; j >= 0; j++) {
					System.out
							.println("Number of water bottles available are: "
									+ q2);
					System.out
							.println("Enternumber of water bottles you need ");
					n2 = scan.nextInt();

					if ((n2 <= q2) && (n2 != 0)) {
						t = n2 * 1;
						System.out.println("Insert  " + t + " coins");
						for (r = 0; r >= 0; r++) {
							p = scan.nextInt();
							if (p == t) {
								System.out.println("Transaction completed"
										+ "Please collect  " + n2
										+ "  water bottles");
								System.out
										.println("Enter numbers between 0 and 4 to continue purchase or enter 5 to end purchase");
								r = 0;
								break;
							} else {
								System.out.println("Amount not sufficient");

							}
						}
						removeWaterbottle(n2);// calls method to remove number
												// of water bottles purchased
												// from the list.
						j = 0;
						break;
					} else
						System.out
								.println("Number of water bottles available are: "
										+ q2);
					System.out.println("Enter available Quantity");
				}

				break;
			case 3:
				System.out.println("Gum is Selected");

				for (j = 0; j >= 0; j++) {
					System.out.println("Number of gums available are: " + q3);
					System.out.println("Enter number of Gums you need");
					n3 = scan.nextInt();// the user enters the quantity

					if ((n3 <= q3) && (n3 != 0)) {
						t = n3 * 4;
						System.out.println("Insert  " + t + " coins");
						for (r = 0; r >= 0; r++) {
							p = scan.nextInt();// user inserts the coins
							if (p == t) {
								System.out.println("Transaction completed"
										+ "Please collect  " + n3 + "  Gums");
								System.out
										.println("Enter numbers between 0 and 4 to continue purchase or enter 5 to end purchase");
								r = 0;
								break;
							} else {
								// Tells user to provide sufficient amount to
								// complete transaction
								System.out.println("Amount not sufficient");

							}
						}
						removeGum(n3);// calls the method to remove number of
										// gums purchased from the list.
						j = 0;
						break;
					} else
						// Displays the available quatity when user enters
						// incorrect value.
						System.out.println("Number of gums available are: "
								+ q3);
					System.out.println("Enter available Quantity");
				}
				break;

			case 4:
				System.out.println("Chips is Selected");
				for (j = 0; j >= 0; j++) {
					System.out.println("Number of chipsPackets available are: "
							+ q4);
					System.out.println("Enter number of packets you need");
					n4 = scan.nextInt();// the user enters the quantity.

					if ((n4 <= q4) && (n4 != 0)) {
						t = n4 * 5;
						System.out.println("Insert  " + t + " coins");
						for (r = 0; r >= 0; r++) {
							p = scan.nextInt();// user inserts the coins
							if (p == t) {
								System.out.println("Transaction completed"
										+ "Please collect  " + n4
										+ "  Chips packets");
								System.out
										.println("Enter numbers between 0 and 4 to continue purchase or enter 5 to end purchase");
								r = 0;
								break;
							} else {
								// Tells user to provide sufficient amount to
								// complete transaction
								System.out.println("Amount not sufficient");

							}
						}
						removeChips(n4);// calling the method to remove chips
										// packets purchased from the list.
						j = 0;
						break;
					} else
						// Displays the available quatity when user enters
						// incorrect value.
						System.out
								.println("Number of chipsPackets available are: "
										+ q4);
					System.out.println("Enter available Quantity");
				}

				break;
			case 5:
				// When purchase ends
				System.out.println("Thank you for the purchase");
				break;
			default:
				// If user enters incorrect number
				System.out
						.println("Enter the numbers 0 or 1 or 2 or 3 or 4 to Begin Purchase ");
			}
			if (s == 5) {
				System.out.println("Please Visit again");
				break;
			}
		}

		scan.close();
	}

}

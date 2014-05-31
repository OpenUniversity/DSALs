/*import static BonusProgram.Buying;
class ShoppingSession {
	int totalAmount = 0;
	ShoppingCart sc = new ShoppingCart();

	void buy(final Item item, int amount) {
		Category category = Database.categoryOf(item);
		// changes start here
		totalAmount = exhibit
			Buying(Category c, int amount) {
				sc.add(item, amount);
				return totalAmount + amount;
			} (category, amount);
	}
}*/

/*
aspect BonusProgram {
	joinpoint int Buying(a.Category cat, int amount);

	before Buying(Category cat, int amount) {
		if (cat == Item.BOOK)
			amt += amt / 2;
		return proceed(cat, amt);
	}
*/

import static BonusProgram.Buying;
class ShoppingSession {
	int totalAmount = 0;
	ShoppingCard sc = new ShoppingCard();

	void buy(final Item item, int amount) {
		Category category = Database.categoryOf(item);
		totalAmount = exhibit
			Buying(Category c, int amount) {
				sc.add(item, amount);
				return totalAmount + amount;
			} (category, amount);
	}
}

aspect BonusProgram {
	joinpoint int Buying(Category cat, int amont);
	int around Buying(Category cat, int amt) {
		if (cat == Item.BOOK)
			amt += amt/2;
		return proceed(cat, amt);
	}
}
/*
class Agent {
	void aa(int a) {}
	
	final CardProcessor cc = makeCardProcessor();

	void createTrip(final Person p, final Flight f, final Hotel h) {
		aa();
		exhibit Transaction(int l) {
			f.reserveSeat(p);
			h.reserveRoom(p);
			cc.debit(p.getCC(), f.total(), h.total());
		} (Level.L1);
		suggestRentalCars(p.f);
	}
}
*/
/*	int around(a.b.Category cat, int amount): call(* Buying(Category, int)) && args(cat, amount) {
		if (cat == Item.BOOK)
			amt += amt / 2;
		return proceed(cat, amt);
	}*/

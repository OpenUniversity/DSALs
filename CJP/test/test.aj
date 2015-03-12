package research;

aspect Impact {
  joinpoint void say(String message);

  after say(String message) {
    System.out.println(
      "It did a " + message + " of good.");
  }
}


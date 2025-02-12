
fun main() {
    var countryCapitals = mutableMapOf(
        "USA" to "Washington",
        "France" to "Paris",
        "Germany" to "Berlin"
    );

    countryCapitals["Canada"] = "Ottawa";
    println(countryCapitals.keys);
    println(countryCapitals.values);

    countryCapitals.remove("Germany");
    println(countryCapitals);

}
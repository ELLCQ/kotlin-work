// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(inputDocument: String, targetText: String, redactCharacter: Char = 'X'): String {
//    produce the redact which has the same length of target string
    val replaceString = buildString {
        repeat(targetText.length) {
            append(redactCharacter)
        }
    }
//    replace all the target string with the redact
    val afterReplace = inputDocument.replace(targetText, replaceString)
    return afterReplace
}
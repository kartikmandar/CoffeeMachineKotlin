enum class DangerLevel(val dangerLevelNo: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return dangerLevelNo
    }
}
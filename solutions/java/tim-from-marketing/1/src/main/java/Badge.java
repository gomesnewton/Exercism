class Badge {

    public String print(Integer id, String name, String department) {

        String badgeFieldId = (id != null ? "[%d] - ".formatted(id) : "");
        String badgeFieldDep = (department != null ? " - %s".formatted(department) : " - OWNER");
        return "%s%s%S".formatted(badgeFieldId, name, badgeFieldDep);
    }

}
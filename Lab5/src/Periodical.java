class Periodical extends Item {
    private int issueNum;

    public int getIssueNum() {
        return this.getIssueNum();
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    Periodical() {
    }

    Periodical(String title, int issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    @Override
    public String getListing() {
        return ("Periodical Title - " + getTitle() + "\nIssue# - " + getIssueNum());
    }
}

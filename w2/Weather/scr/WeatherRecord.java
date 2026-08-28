class WeatherRecord{
    private Date date;
    private Temperature today;
    private Temperature normal;
    private Temperature record;
    private double precipitation;

    public WeatherRecord(Date date, Temperature today, Temperature normal, Temperature record, double precipitation)
    {
        this.date = date;
        this.today = today;
        this.normal = normal;
        this.record = record;
        this.precipitation = precipitation;
    }
}
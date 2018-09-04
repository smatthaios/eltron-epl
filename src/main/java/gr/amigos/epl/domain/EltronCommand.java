package gr.amigos.epl.domain;

public enum EltronCommand {

    ASCII_TEXT("A", EltronMemory.IMAGE),
    AUTOMATIC_FORM_PRINTING("AUTOFR", EltronMemory.FORM),
    BAR_CODE("B", EltronMemory.IMAGE),
    RSS_14_BAR_CODE("B", EltronMemory.IMAGE),
    AZTEC("b", EltronMemory.IMAGE),
    AZTEC_MESA("b", EltronMemory.IMAGE),
    DATA_MATRIX("b", EltronMemory.IMAGE),
    MAXICODE("b", EltronMemory.IMAGE),
    PDF417("b", EltronMemory.IMAGE),
    QR_CODE("b", EltronMemory.IMAGE),
    COUNTER("C", EltronMemory.FORM),
    CUT_IMMEDIATE("C", EltronMemory.NONE),
    DENSITY("D", EltronMemory.STORED),
    ENABLE_DUMP_MODE("dump", EltronMemory.NONE),
    PRINT_SOFT_FONT_INFO("EI", EltronMemory.NONE),
    DELETE_SOFT_FONT("EK", EltronMemory.WRITES),
    USER_DEFINABLE_ERROR_RESPONSE("eR", EltronMemory.WRITES),
    STORE_SOFT_FONT("ES", EltronMemory.WRITES),
    CUT_POSITION("f", EltronMemory.STORED),
    ADJUST_BACKUP_POSITION("fB", EltronMemory.WRITES),
    END_FORM_STORE("FE", EltronMemory.WRITES),
    PRINT_FORM_INFO("FI", EltronMemory.NONE),
    DELETE_FORM("FK", EltronMemory.WRITES),
    RETRIEVE_FORM("FR", EltronMemory.NONE),
    STORE_FORM("FS", EltronMemory.WRITES),
    RETRIEVE_GRAPHICS("GG", EltronMemory.IMAGE),
    PRINT_GRAPHICS_INFO("GI", EltronMemory.NONE),
    DELETE_GRAPHIC("GK", EltronMemory.WRITES),
    STORE_GRAPHIC("GM", EltronMemory.WRITES),
    DIRECT_GRAPHIC_WRITE("GW", EltronMemory.IMAGE),
    ASIAN_CHARACTER_SPACING("i", EltronMemory.STORED),
    CHARACTER_SET_SELECTION("I", EltronMemory.STORED),
    DISABLE_TOP_OF_FORM_BACKUP("JB", EltronMemory.STORED),
    DISABLE_TOP_OF_FORM_BACKUP_FOR_ALL_CASES("JC", EltronMemory.STORED),
    ENABLE_TOP_OF_FORM_BACKUP("JF", EltronMemory.STORED),
    LINE_DRAW_EXCLUSIVE_OR("LE", EltronMemory.IMAGE),
    LINE_DRAW_BLACK("LO", EltronMemory.IMAGE),
    LINE_DRAW_DIAGONAL("LS", EltronMemory.IMAGE),
    LINE_DRAW_WHITE("LW", EltronMemory.IMAGE),
    MEMORY_ALLOCATION("M", EltronMemory.WRITES),
    CLEAR_IMAGE_BUFFER("N", EltronMemory.IMAGE),
    CANCEL_CUSTOMIZED_SETTINGS("o", EltronMemory.WRITES),
    CANCEL_CUSTOMIZE_BAR_CODE("oB", EltronMemory.WRITES),
    LINE_MODE_FONT_SUBSTITUTION("oE", EltronMemory.WRITES),
    MACRO_PDF_OFFSET("oH", EltronMemory.IMAGE),
    DISABLE_INITIAL_ESC_SEQUENCE_FEED("oM", EltronMemory.STORED),
    CHARACTER_SUBSTITUTION_EURO("oR", EltronMemory.WRITES),
    CUSTOMIZE_BAR_CODE_PARAMETERS("oW", EltronMemory.WRITES),
    OPTIONS_SELECT("O", EltronMemory.STORED),
    SET_LINE_MODE("OEPL1", EltronMemory.WRITES),
    PRINT("P", EltronMemory.NONE),
    PRINT_AUTOMATIC("PA", EltronMemory.FORM),
    SET_FORM_WIDTH("q", EltronMemory.STORED),
    SET_FORM_LENGTH("Q", EltronMemory.STORED),
    TRANSMISSIVE_GAP_SENSOR("Q", EltronMemory.STORED),
    BLACK_LINE_SENSOR("Q",EltronMemory.STORED),
    CONTINUOUS_STOCK("Q",EltronMemory.STORED),
    SET_DOUBLE_BUFFER_MODE("r",EltronMemory.STORED),
    SET_REFERENCE_POINT("R",EltronMemory.STORED),
    SPEED_SELECT("S",EltronMemory.STORED),
    DEFINE_DATE_LAYOUT_AND_PRINT_DATE("T",EltronMemory.WRITES),
    SET_REAL_TIME_CLOCK("TS",EltronMemory.STORED),
    DEFINE_TIME_LAYOUT_AND_PRINT_TIME("TT",EltronMemory.WRITES),
    PRINT_CONFIGURATION("U",EltronMemory.NONE),
    ENABLE_CLEAR_LABEL_COUNTER_MODE("UA",EltronMemory.SESSION),
    RESET_LABEL_COUNTER_MODE("UB",EltronMemory.WRITES),
    EXTERNAL_FONT_INFORMATION_INQUIRY("UE",EltronMemory.NONE),
    FORM_INFORMATION_INQUIRY("UF",EltronMemory.NONE),
    GRAPHIC_INFORMATION_INQUIRY("UG",EltronMemory.NONE),
    HOST_PROMPTS_OR_CODEPAGE_INQUIRY("UI",EltronMemory.SESSION),
    CODEPAGE_AND_MEMORY_INQUIRY("UM",EltronMemory.SESSION),
    DISABLE_ERROR_REPORTING("UN",EltronMemory.STORED),
    CODEPAGE_AND_MEMORY_INQUIRY_OR_PRINT("UP",EltronMemory.NONE),
    CONFIGURATION_INQUIRY("UQ",EltronMemory.NONE),
    ENABLE_ERROR_REPORTING("US",EltronMemory.STORED),
    ENABLE_ALTERNATE_ERROR_REPORTING("UT",EltronMemory.STORED),
    HOST_PROMPTS_OR_BATTERY_INQUIRY("U%",EltronMemory.NONE),
    HOST_PROMPTS_OR_MOTOR_TEMPERATURE_INQUIRY("U$",EltronMemory.NONE),
    DEFINE_VARIABLE("V",EltronMemory.FORM),
    WINDOWS_MODE("W",EltronMemory.STORED),
    SENSE_MEDIA("xa",EltronMemory.WRITES),
    BOX_DRAW("X",EltronMemory.IMAGE),
    SERIAL_PORT_SETUP("Y",EltronMemory.STORED),
    PRINT_DIRECTION("Z",EltronMemory.STORED),
    DOWNLOAD_VARIABLES("?",EltronMemory.FORM),
    RESET_PRINTER("^@",EltronMemory.NONE),
    SET_PRINTER_TO_FACTORY_DEFAULTS("^default",EltronMemory.WRITES),
    STATUS_REPORT_IMMEDIATE("^ee",EltronMemory.NONE),
    CODE_COMMENT_LINE(";",EltronMemory.FORM);

    private String value;
    private EltronMemory eltronMemory;

    EltronCommand(String value, EltronMemory eltronMemory) {
        this.value = value;
        this.eltronMemory = eltronMemory;
    }

    public String getValue() {
        return value;
    }

    public EltronMemory getEltronMemory() {
        return eltronMemory;
    }
    }

package core.tables;

import java.util.ArrayList;
import java.util.HashMap;

import core.DXF_Utils;
import core.Section;

public class Section_TABLES extends Section {
	
	public String MY_BLOCK_RECORDS = "";
	public String MY_BLKREFS = "";
	public String MY_ACAD_REACTORS = "";
	
	public HashMap<String, DXF_style> DXF_styles = new HashMap<>();
	
	public Section_TABLES() {
		section_name = "SECTION_TABLES.txt";
		body = super.init();		
	}
	@Override
	public String to_string() {
		values.put("MY_BLOCK_RECORDS", MY_BLOCK_RECORDS);
		values.put("MY_BLKREFS", MY_BLKREFS);
		values.put("MY_ACAD_REACTORS", MY_ACAD_REACTORS);
		//System.out.println(MY_BLOCK_RECORDS);
		body = DXF_Utils.replace_values(values, body);
		return DXF_Utils.replace_values(values, body);
	}

}
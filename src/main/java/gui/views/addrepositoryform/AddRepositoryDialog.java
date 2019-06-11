package gui.views.addrepositoryform;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tabs.Orientation;

/**
 * @author Miguel Ángel León Bardavío - mlb0029
 *
 */
public class AddRepositoryDialog extends Dialog {

	private static final long serialVersionUID = -2348702400211722166L;

	private List<AddRepositoryForm> addRepositoryForms = new ArrayList<>();
	
	public AddRepositoryDialog() {
		createConnectionForms();

		Tabs tabs = new Tabs();
		tabs.setOrientation(Orientation.VERTICAL);
		tabs.setWidth("30%");

		Div formsPages = new Div();
		formsPages.setWidth("70%");

		for (AddRepositoryForm form : addRepositoryForms) {
			tabs.add(form.getTab());
			formsPages.add(form.getPage());
			form.addAddedSuccessfulListener(c -> {
				addRepositoryForms.forEach(connForm -> connForm.clearFields());
				close();
			});
		}

		tabs.addSelectedChangeListener(event -> {
			for (AddRepositoryForm form : addRepositoryForms) {
				if (form.getTab() == event.getSource().getSelectedTab())
					form.getPage().setVisible(true);
				else {
					form.getPage().setVisible(false);
					form.clearFields();
				}
			}
		});
		
		addOpenedChangeListener(event -> {
			if(event.isOpened()) {
				addRepositoryForms.forEach(connForm -> connForm.getPage().setVisible(false));
				tabs.setSelectedTab(addRepositoryForms.get(0).getTab());
				addRepositoryForms.get(0).getPage().setVisible(true);				
			}
		});
		
		HorizontalLayout connFormsHLayout = new HorizontalLayout(tabs, formsPages);
		connFormsHLayout.setSizeFull();
		add(connFormsHLayout);

		setWidth("600px");
		setHeight("400px");
		setCloseOnEsc(true);
		setCloseOnOutsideClick(true);
	}

	private void createConnectionForms() {
		addRepositoryForms.add(new AddRepositoryFormByUsername());
		addRepositoryForms.add(new AddRepositoryFormByGroup());
		addRepositoryForms.add(new AddRepositoryFormByURL());
	}

}

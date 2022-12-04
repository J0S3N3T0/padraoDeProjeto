public class App {
    public static void main(String[] args) throws Exception {
    
        BoxComposite leftBox = new BoxComposite();
        ShoeLeaf sapatoSocial = new ShoeLeaf(1500);
        leftBox.addProduct(sapatoSocial);


   
        BoxComposite upperMiddleBox = new BoxComposite();
        BoxComposite bottomMiddleBox = new BoxComposite();
       

        ShoeLeaf sapatoInfantilMasculino = new ShoeLeaf(120);
        ShoeLeaf sapatoInfantilFeminino = new ShoeLeaf(120);


        bottomMiddleBox.addProduct(sapatoInfantilMasculino);
        bottomMiddleBox.addProduct(sapatoInfantilFeminino);
        upperMiddleBox.addProduct(bottomMiddleBox);

        ShoeLeaf sapataoDePalhaco = new ShoeLeaf(500);
      
        ShoeLeaf recipt = new ShoeLeaf(0);



    
        BoxComposite zeNetoSapapos = new BoxComposite();
        zeNetoSapapos.addProduct(leftBox);
        zeNetoSapapos.addProduct(upperMiddleBox);
        zeNetoSapapos.addProduct(recipt);
        zeNetoSapapos.addProduct(sapataoDePalhaco);



        System.out.println("Preço total dos produtos: " + zeNetoSapapos.getPrice());
    }
}
